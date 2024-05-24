package com.admin.codeflix.infrastructure.api.controllers;

import com.admin.codeflix.application.category.create.CreateCategoryCommand;
import com.admin.codeflix.application.category.create.CreateCategoryOutput;
import com.admin.codeflix.application.category.create.CreateCategoryUseCase;
import com.admin.codeflix.application.category.retrieve.get.GetCategoryByIdUseCase;
import com.admin.codeflix.domain.pagination.Pagination;
import com.admin.codeflix.domain.validation.handler.Notification;
import com.admin.codeflix.infrastructure.api.CategoryAPI;
import com.admin.codeflix.infrastructure.category.models.CategoryApiOutput;
import com.admin.codeflix.infrastructure.category.models.CreateCategoryApiInput;
import com.admin.codeflix.infrastructure.category.presenters.CategoryApiPresenter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.Objects;
import java.util.function.Function;

@RestController
public class CategoryController implements CategoryAPI {

    private final CreateCategoryUseCase createCategoryUseCase;
    private final GetCategoryByIdUseCase getCategoryByIdUseCase;

    public CategoryController(
            final CreateCategoryUseCase createCategoryUseCase,
                              final GetCategoryByIdUseCase getCategoryByIdUseCase
    ) {
        this.createCategoryUseCase = Objects.requireNonNull(createCategoryUseCase);
        this.getCategoryByIdUseCase = Objects.requireNonNull(getCategoryByIdUseCase);
    }

    @Override
    public ResponseEntity<?> createCategory(CreateCategoryApiInput input) {
        final var aCommand = CreateCategoryCommand.with(
                input.name(),
                input.description(),
                input.active() != null ? input.active() : true
        );

        final Function<Notification, ResponseEntity<?>> onError = notification ->
                ResponseEntity.unprocessableEntity().body(notification);

        final Function<CreateCategoryOutput, ResponseEntity<?>> onSuccess = output ->
                ResponseEntity.created(URI.create("/categories/" + output.id())).body(output);

        return this.createCategoryUseCase.execute(aCommand)
                .fold(onError, onSuccess);
    }

    @Override
    public Pagination<?> listCategories(String search, int page, int perPage, String sort, String direction) {
        return null;
    }

    @Override
    public CategoryApiOutput getById(final String id) {
        return CategoryApiPresenter.present(this.getCategoryByIdUseCase.execute(id));
    }
}
