package com.admin.codeflix.application.category.create;

import com.admin.codeflix.application.UseCase;
import com.admin.codeflix.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {
}
