package dev.lavan.SimpleRestApp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionList {
    @ExceptionHandler(ErrorDTOException.class)
    public ResponseEntity<ResponseDTO> handleErrorDTO(ErrorDTOException ex) {
        ResponseDTO response= (ResponseDTO) ex.getDTOObj();

        return ResponseEntity.badRequest().body(response);
    }
}
