package com.tastecamp.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/holiday")

public class HolidayController {
    @GetMapping("/{date}")
    public String ItIsHoliday(@PathVariable String date) {
        Object holidays = new Object();
        // holidays.put("date", "01-01");
        return "Ainda não foram coletados dados o bastante para determinar se " + date + " é feriado.";
    }

    // public static void 
    
}
