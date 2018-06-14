package com.test.providerdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * api首页.
 * @author Ryan Miao at 2018-06-14 15:03
 **/
@Controller
public class HomeController {
    @GetMapping(value = {"/api", "/"})
    public String api() {
        return "redirect:/swagger-ui.html";
    }

}
