package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ReportController {
    

    @GetMapping("/")
    public String index(ModelMap map) {
        return "index";
    }
    
    @GetMapping("/about")
    public String about(ModelMap map) {
        return "about";
    }
    @GetMapping("/contact")
    public String contact(ModelMap map) {
        return "contact";
    }
    @GetMapping("/layout")
    public String layout(ModelMap map) {
        return "layout";
    }


    
}
