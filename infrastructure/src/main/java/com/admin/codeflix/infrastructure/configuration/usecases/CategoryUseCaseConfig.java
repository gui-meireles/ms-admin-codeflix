package com.admin.codeflix.infrastructure.configuration.usecases;

import com.admin.codeflix.application.category.create.CreateCategoryUseCase;
import com.admin.codeflix.application.category.create.DefaultCreateCategoryUseCase;
import com.admin.codeflix.application.category.delete.DefaultDeleteCategoryUseCase;
import com.admin.codeflix.application.category.delete.DeleteCategoryUseCase;
import com.admin.codeflix.application.category.retrieve.get.DefaultGetCategoryByIdUseCase;
import com.admin.codeflix.application.category.retrieve.get.GetCategoryByIdUseCase;
import com.admin.codeflix.application.category.retrieve.list.DefaultListCategoriesUseCase;
import com.admin.codeflix.application.category.retrieve.list.ListCategoriesUseCase;
import com.admin.codeflix.application.category.update.DefaultUpdateCategoryUseCase;
import com.admin.codeflix.application.category.update.UpdateCategoryUseCase;
import com.admin.codeflix.domain.category.CategoryGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryUseCaseConfig {

    private final CategoryGateway categoryGateway;

    public CategoryUseCaseConfig(final CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Bean
    public CreateCategoryUseCase createCategoryUseCase() {
        return new DefaultCreateCategoryUseCase(categoryGateway);
    }

    @Bean
    public UpdateCategoryUseCase updateCategoryUseCase() {
        return new DefaultUpdateCategoryUseCase(categoryGateway);
    }

    @Bean
    public GetCategoryByIdUseCase getCategoryByIdUseCase() {
        return new DefaultGetCategoryByIdUseCase(categoryGateway);
    }

    @Bean
    public ListCategoriesUseCase listCategoriesByIdUseCase() {
        return new DefaultListCategoriesUseCase(categoryGateway);
    }

    @Bean
    public DeleteCategoryUseCase deleteCategoryUseCase() {
        return new DefaultDeleteCategoryUseCase(categoryGateway);
    }
}
