package com.tastecamp.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check-number")
public class CheckNumberController {
    
    @GetMapping("/{number}")
    public String getCheckNumber(@PathVariable int number) {
        String text = number + " é um número " + PairOrOdd(number) + " e " + PositiveOrNegative(number);
        return text;
    }

    public static String PairOrOdd ( int number){
        String word = "";
        if(number % 2 == 0) word = "par";
        else word = "impar";
        return word;
    }

    public static String PositiveOrNegative( int number){
        String word = "";
        if(number > 0) word = "positivo";
        else word = "negativo";
        return word;
    }
}
