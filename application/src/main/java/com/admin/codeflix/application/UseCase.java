package com.admin.codeflix.application;

import com.admin.codeflix.domain.category.Category;

public abstract class UseCase<IN, OUT> {

    public abstract OUT execute(IN anInd);
}