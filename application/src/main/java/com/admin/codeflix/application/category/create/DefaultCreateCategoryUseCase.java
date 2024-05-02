package com.admin.codeflix.application.category.create;

import com.admin.codeflix.domain.category.Category;
import com.admin.codeflix.domain.category.CategoryGateway;
import com.admin.codeflix.domain.validation.handler.Notification;
import io.vavr.control.Either;

import java.util.Objects;

public class DefaultCreateCategoryUseCase extends CreateCategoryUseCase {

    private final CategoryGateway categoryGateway;

    public DefaultCreateCategoryUseCase(CategoryGateway categoryGateway) {
        this.categoryGateway = Objects.requireNonNull(categoryGateway);
    }

    @Override
    public Either<Notification, CreateCategoryOutput> execute(final CreateCategoryCommand aCommand) {
        final var aName = aCommand.name();
        final var aDescription = aCommand.description();
        final var isActive = aCommand.isActive();

        final var notification = Notification.create();
        final var aCategory = Category.newCategory(aName, aDescription, isActive);
        aCategory.validate(notification);

        if (notification.hasError()) {
            // TODO Implement return
        }

        return CreateCategoryOutput.from(this.categoryGateway.create(aCategory));
    }
}
