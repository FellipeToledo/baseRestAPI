package com.structure.baseRestAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/first")
public class FirstController {

    @GetMapping
    public String getFirst(){
        return "Test getFirst";
    }
}
