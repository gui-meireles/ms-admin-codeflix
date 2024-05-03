package com.admin.codeflix.application.category.update;

import com.admin.codeflix.application.UseCase;
import com.admin.codeflix.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class UpdateCategoryUseCase extends UseCase<UpdateCategoryCommand, Either<Notification, UpdateCategoryOutput>> {
}
