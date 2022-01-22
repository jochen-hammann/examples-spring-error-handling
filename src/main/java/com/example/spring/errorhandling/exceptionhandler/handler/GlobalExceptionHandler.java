package com.example.spring.errorhandling.exceptionhandler.handler;

import com.example.spring.errorhandling.exceptionhandler.dto.MyError;
import com.example.spring.errorhandling.exceptionhandler.exceptions.Exception2;
import com.example.spring.errorhandling.exceptionhandler.exceptions.Exception3;
import com.example.spring.errorhandling.exceptionhandler.exceptions.Exception4;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.UUID;

@ControllerAdvice
public class GlobalExceptionHandler // extends ResponseEntityExceptionHandler  --> Default exception handling.
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    // ============================== [Construction / Destruction] ==============================

    // -------------------- [Public Construction / Destruction] --------------------

    // ============================== [Getter/Setter] ==============================

    // -------------------- [Private Getter/Setter] --------------------

    // -------------------- [Public Getter/Setter] --------------------

    // ============================== [Methods] ==============================

    // -------------------- [Private Methods] --------------------


    @ExceptionHandler
    private ResponseEntity<String> handleException2(Exception2 exception1)
    {
        ResponseEntity<String> responseEntity = ResponseEntity.badRequest().body("Exception 2 occurred. Handled within @ControllerAdvice.");
        return responseEntity;
    }

    @ExceptionHandler
    private ResponseEntity<String> handleException3(Exception3 exception3)
    {
        ResponseEntity<String> responseEntity = ResponseEntity.badRequest().body("Exception 3 occurred.");
        return responseEntity;
    }

    // -------------------- [Public Methods] --------------------

    // Caution: Because the following method returns a Java POJO and not ResponseEntity<>, we must specify @ResponseBody.
    //          Otherwise, the following exception is thrown: javax.servlet.ServletException: Circular view path [exception4]: would dispatch back
    //          to the current handler URL [/exception4] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view,
    //          due to default view name generation.)
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public MyError handleException4(Exception4 exception4)
    {
        MyError myError = new MyError();
        myError.setId(UUID.randomUUID().toString());
        myError.setMessage("Exception 4 has been thrown.");

        return myError;
    }
}
