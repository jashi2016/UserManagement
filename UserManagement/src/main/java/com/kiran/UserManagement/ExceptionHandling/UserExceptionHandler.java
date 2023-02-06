package com.kiran.UserManagement.ExceptionHandling;

import com.kiran.UserManagement.Model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFound.class)
    @ResponseBody
    private ErrorResponse userNotFoundExceptionHandler(UserNotFound userNotFound){
        return new ErrorResponse(HttpStatus.NOT_FOUND,userNotFound.getMessage());
    }

}
