package com.website.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/")
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String index() {
        return "Great Success";
    }
}