package com.springboot.portfolio.PortfolioApplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        /*
        Route for HTML file render. Model is the context. Similar to Flask.
         */
        return "index";
    }
}
