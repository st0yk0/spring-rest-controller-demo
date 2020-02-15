package com.spring.rest.demo.controllers;

import com.gtranslate.Translator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class DateToDayController {

    @RequestMapping("/DateToDay")
    private DayOfWeek translateService(@RequestParam(value = "date") String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate.getDayOfWeek();

    }
}
