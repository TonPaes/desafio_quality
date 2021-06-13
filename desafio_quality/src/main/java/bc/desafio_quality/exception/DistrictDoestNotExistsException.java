package bc.desafio_quality.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class DistrictDoestNotExistsException extends RuntimeException {
    private String message;
    private HttpStatus status = HttpStatus.NOT_FOUND;
    
    public DistrictDoestNotExistsException(String district){
        this.message = "District"+ district + "does not exist";
    }
}
