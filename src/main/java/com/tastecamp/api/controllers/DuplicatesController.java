package com.tastecamp.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/duplicates")
public class DuplicatesController {
    @GetMapping
    public String Duplicates(@RequestParam List<String> array1, @RequestParam List<String> array2) {
        String text = "";
        for(int i=0; i<array1.size(); i++){
            String value1 = array1.get(i);
            for(int j=0; j<array2.size();j++){
                String value2 = array2.get(j);
                if(value1.equals(value2)){
                    System.out.println(value1);
                    text += value1 + "\n";
                }
            }
        }
        return text;
    }
    
}
