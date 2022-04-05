package site.metacoding.test01.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import site.metacoding.test01.web.api.dto.ResponseDto;

@RestControllerAdvice
public class ErrorHandler {
    
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseDto<String> error1(RuntimeException e) {
        return new ResponseDto<String>();
    }
}
