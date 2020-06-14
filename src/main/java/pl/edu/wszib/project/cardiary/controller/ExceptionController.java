package pl.edu.wszib.project.cardiary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    public static class NotFoundException extends RuntimeException{
    }

    @ExceptionHandler(NotFoundException.class)
    public String notFound(){
        return "404";
    }

}
