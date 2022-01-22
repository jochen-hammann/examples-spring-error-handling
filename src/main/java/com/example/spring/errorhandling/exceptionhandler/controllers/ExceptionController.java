package com.example.spring.errorhandling.exceptionhandler.controllers;

import com.example.spring.errorhandling.exceptionhandler.dto.MyError;
import com.example.spring.errorhandling.exceptionhandler.exceptions.Exception1;
import com.example.spring.errorhandling.exceptionhandler.exceptions.Exception2;
import com.example.spring.errorhandling.exceptionhandler.exceptions.Exception3;
import com.example.spring.errorhandling.exceptionhandler.exceptions.Exception4;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class ExceptionController
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
    private ResponseEntity<String> handleException1(Exception1 exception1)
    {
        ResponseEntity<String> responseEntity = ResponseEntity.badRequest().body("Exception 1 occurred.");
        return responseEntity;
    }

    @ExceptionHandler
    private ResponseEntity<String> handleException2(Exception2 exception1)
    {
        ResponseEntity<String> responseEntity = ResponseEntity.badRequest().body("Exception 2 occurred. Handled within @RestController.");
        return responseEntity;
    }

    // -------------------- [Public Methods] --------------------

    @GetMapping(path = "exception1")
    public String getException1() throws Exception1
    {
        throw new Exception1();
    }

    @GetMapping(path = "exception2")
    public String getException2() throws Exception2
    {
        throw new Exception2();
    }

    @GetMapping(path = "exception3")
    public String getException3() throws Exception3
    {
        throw new Exception3();
    }

    @GetMapping(path = "exception4")
    public String getException4() throws Exception4
    {
        throw new Exception4();
    }
}
