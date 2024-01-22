package com.tastecamp.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {
    @GetMapping("/{number}")
    public String Fibonacci(@PathVariable int number) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<number; i++){
            if(numbers.size() <= 1) numbers.add(i);
            else numbers.add(numbers.get( numbers.size() - 1) + numbers.get( numbers.size() - 2));
        }
        String text = "";
        for(int i=0; i < numbers.size(); i++){
            text += numbers.get(i) + " ";
        }
        return text;
    }
    
}
