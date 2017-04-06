/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author fahmi
 */
@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("name", "fahmi");
        return "home";
    }
    
    @RequestMapping("/login")
    public String login(Model model){
        return "login";
    }
    @RequestMapping("/dashboard")
    public String dashboard(Model model){
        return "dashboard";
    }
    
}
