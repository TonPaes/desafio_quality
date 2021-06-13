package bc.desafio_quality.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import bc.desafio_quality.exception.DistrictDoestNotExistsException;

@ControllerAdvice
public class PropertyExceptionController {
    @ExceptionHandler(DistrictDoestNotExistsException.class)
    ResponseEntity<DistrictDoestNotExistsException> handleDistrictNotExists(DistrictDoestNotExistsException exception){
        return ResponseEntity.status(exception.getStatus()).body(exception);
    }
}
