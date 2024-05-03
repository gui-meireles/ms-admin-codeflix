package com.admin.codeflix.application.category.retrieve.list;

import com.admin.codeflix.application.UseCase;
import com.admin.codeflix.domain.category.CategorySearchQuery;
import com.admin.codeflix.domain.pagination.Pagination;

public abstract class ListCategoriesUseCase extends UseCase<CategorySearchQuery, Pagination<CategoryListOutput>> {
}
