package com.example.spring.errorhandling.exceptionhandler.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
class ExceptionControllerIT
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    @Autowired
    private MockMvc mvc;

    // ============================== [Unit Tests] ==============================

    // -------------------- [Test Helper Classes] --------------------

    // -------------------- [Test Helper Methods] --------------------

    // -------------------- [Test Initialization] --------------------

    // -------------------- [Tests] --------------------

    @Test
    void getException1() throws Exception
    {
        String result = mvc.perform(get("/exception1")).andDo(print()).andReturn().getResponse().getContentAsString();

        System.out.println(result);
    }

    @Test
    void getException2() throws Exception
    {
        String result = mvc.perform(get("/exception2")).andDo(print()).andReturn().getResponse().getContentAsString();

        System.out.println(result);
    }

    @Test
    void getException3() throws Exception
    {
        String result = mvc.perform(get("/exception3")).andDo(print()).andReturn().getResponse().getContentAsString();

        System.out.println(result);
    }

    @Test
    void getException4() throws Exception
    {
        String result = mvc.perform(get("/exception4")).andDo(print()).andReturn().getResponse().getContentAsString();

        System.out.println(result);
    }
}
