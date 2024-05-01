package com.admin.codeflix.domain.category;

import com.admin.codeflix.domain.pagination.Pagination;

import java.util.Optional;

public interface CategoryGateway {

    Category create(Category aCategory);
    void delete(CategoryID anId);
    Optional<Category> findById(CategoryID anId);
    Category update(Category aCategory);
    Pagination<Category> findAll(CategorySearchQuery aQuery);
}
