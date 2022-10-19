package ru.ppakhomkin.udemy.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.ppakhomkin.udemy.entity.message.EmployeeExceptionInfo;

@ControllerAdvice
public class AppExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<EmployeeExceptionInfo> noSuchEmpExceptionHandler(NoSuchEmployeeException exception) {
        return new ResponseEntity<>(new EmployeeExceptionInfo(exception.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeExceptionInfo> noSuchEmpExceptionHandler(Exception exception) {
        return new ResponseEntity<>(new EmployeeExceptionInfo(exception.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
