package com.tastecamp.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/pyramid")
public class PyramidController {
    @GetMapping("/{number}")
    public String Pyramid(@PathVariable int number) {
        String text = "";
        for(int i=1; i<=number; i++){
            for(int j=1; j<=i; j++){
                text += i + " ";
            }
            text += "\n";
        }
        return text;
    }
    
}
