package com.admin.codeflix.infrastructure.category.presenters;

import com.admin.codeflix.application.category.retrieve.get.CategoryOutput;
import com.admin.codeflix.infrastructure.category.models.CategoryApiOutput;

public interface CategoryApiPresenter {

    static CategoryApiOutput present(final CategoryOutput output) {
        return new CategoryApiOutput(
                output.id().getValue(),
                output.name(),
                output.description(),
                output.isActive(),
                output.createdAt(),
                output.updatedAt(),
                output.deletedAt()
        );
    }
}
