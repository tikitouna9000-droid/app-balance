package com.balance.exceptions;

import com.balance.dto.ErrorDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorDto> handleRuntimeException(RuntimeException ex){

        ErrorDto errorDto = new ErrorDto(ex.getMessage(), "400");

        return ResponseEntity.badRequest().body(errorDto);
    }
}
