package com.admin.codeflix.application;

public abstract class UseCase<IN, OUT> {

    public abstract OUT execute(IN anInd);
}