package io.s3rice.riceservice.exception.advice;

import io.s3rice.riceservice.dto.ErrorMessage;
import io.s3rice.riceservice.dto.ErrorResponse;
import io.s3rice.riceservice.exception.RiceTypeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RiceTypeRestControllerAdvice {

    @ExceptionHandler({RiceTypeNotFoundException.class})
    public ResponseEntity<ErrorResponse> error(RiceTypeNotFoundException exception){
        ErrorMessage errorMessage=new ErrorMessage(exception.getMessage(), HttpStatus.NOT_FOUND.value(),exception.getClass().getName());
        return new ResponseEntity<>(new ErrorResponse(errorMessage),HttpStatus.NOT_FOUND);
    }


}
