package com.admin.codeflix.application.category.update;

import com.admin.codeflix.domain.category.Category;
import com.admin.codeflix.domain.category.CategoryID;

public record UpdateCategoryOutput(
        CategoryID id
) {

    public static UpdateCategoryOutput from(final Category aCategory) {
        return new UpdateCategoryOutput(aCategory.getId());
    }
}
