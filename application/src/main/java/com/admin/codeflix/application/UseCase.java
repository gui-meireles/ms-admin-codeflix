package com.admin.codeflix.application;

import com.admin.codeflix.domain.category.Category;

public class UseCase {
    public Category execute() {
        return Category.newCategory("Filmes", "A categoria mais assistida", true);
    }
}