/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author fahmi
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    
    @GetMapping(value = "/home")
    public String home(Model model){
        model.addAttribute("name", "admin");
        return "home";
    }
    
}
