package com.admin.codeflix.application.category.delete;

import com.admin.codeflix.domain.category.CategoryGateway;
import com.admin.codeflix.domain.category.CategoryID;

import java.util.Objects;

public class DefaultDeleteCategoryUseCase extends DeleteCategoryUseCase {

    private final CategoryGateway categoryGateway;

    public DefaultDeleteCategoryUseCase(CategoryGateway categoryGateway) {
        this.categoryGateway = Objects.requireNonNull(categoryGateway);
    }

    @Override
    public void execute(final String anId) {
        this.categoryGateway.deleteById(CategoryID.from(anId));
    }
}
