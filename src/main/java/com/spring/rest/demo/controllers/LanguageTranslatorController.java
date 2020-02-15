package com.spring.rest.demo.controllers;

import com.gtranslate.Language;
import com.gtranslate.Translator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageTranslatorController {

    @GetMapping("/translate")
    private String translateService(@RequestParam(value = "word") String word, @RequestParam(value = "translateFROM") String translateFROM, @RequestParam(value = "translateTO") String translateTO) {
        Translator translate = Translator.getInstance();
        String text = translate.translate(word, translateFROM, translateTO);
        return text;
    }
}