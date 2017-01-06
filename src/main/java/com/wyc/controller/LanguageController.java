package com.wyc.controller;

import com.wyc.pojo.Language;
import com.wyc.service.CustomerService;
import com.wyc.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Yc on 2017/1/6.
 */
@RestController
@RequestMapping("/language")
public class LanguageController {

    @Autowired
    private LanguageService languageService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Language> getLanguage(){
        List<Language> language = languageService.getLanguage();
        return language;


    }

}
