package com.tastecamp.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/multiplication-table")
public class MultiplicationTableController {
    @GetMapping("/{number}")
    public String MultiplicationTable(@PathVariable int number) {
        String text = "";
        for(int i=1; i<=10; i++){
            int multiplication = number*i;
            text += number + " * " + i + " = " + multiplication + "\n";
        }
        return text;
    }
    
}
