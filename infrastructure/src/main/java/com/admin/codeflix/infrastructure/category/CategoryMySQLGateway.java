package com.admin.codeflix.infrastructure.category;

import com.admin.codeflix.domain.category.Category;
import com.admin.codeflix.domain.category.CategoryGateway;
import com.admin.codeflix.domain.category.CategoryID;
import com.admin.codeflix.domain.category.CategorySearchQuery;
import com.admin.codeflix.domain.pagination.Pagination;
import com.admin.codeflix.infrastructure.category.persistence.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryMySQLGateway implements CategoryGateway {

    private final CategoryRepository repository;

    public CategoryMySQLGateway(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Category create(Category aCategory) {
        return null;
    }

    @Override
    public void deleteById(CategoryID anId) {

    }

    @Override
    public Optional<Category> findById(CategoryID anId) {
        return Optional.empty();
    }

    @Override
    public Category update(Category aCategory) {
        return null;
    }

    @Override
    public Pagination<Category> findAll(CategorySearchQuery aQuery) {
        return null;
    }
}
