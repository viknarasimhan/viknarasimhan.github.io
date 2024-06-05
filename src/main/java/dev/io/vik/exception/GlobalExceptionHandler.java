package dev.io.vik.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";

    @ResponseStatus(HttpStatus.NOT_FOUND)  // 409
    @ExceptionHandler(Error.class)
    public String handleError() {
        return DEFAULT_ERROR_VIEW;
    }

}
