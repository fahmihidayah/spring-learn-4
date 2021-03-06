/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.controller;

import com.widsons.spr4.conf.Constantas;
import com.widsons.spr4.domain.Pager;
import com.widsons.spr4.domain.Patient;
import com.widsons.spr4.service.PatientService;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import javax.xml.ws.BindingType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fahmi
 */

@Controller
@RequestMapping("/patient")
public class PatientController {
    
    @Autowired
    PatientService patientService;
    
    @GetMapping("/create")
    public String form(Model model){
        model.addAttribute("patient", new Patient());
        model.addAttribute("url", "/patient/create");
        return "patient_form";
    }
    
    @PostMapping("/create")
    public String save(
           @ModelAttribute @Valid Patient patient, 
            BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "patient_form";
        }
        patientService.save(patient);
        return "redirect:/patient/list";
    }
    
    
    @GetMapping("/list")
    public String listPage(Model model, @RequestParam("page") Optional<Integer> page, 
            @RequestParam("page_size") Optional<Integer> pageSize){
        Page<Patient> patientPage = patientService.findAll(page, pageSize);
        Pager pager = new Pager(patientPage.getTotalPages(), patientPage.getNumber(), Constantas.DEFAULT_PAGE_SHOW);
        model.addAttribute("patientPage", patientPage);
        model.addAttribute("startPage", pager.getStartPage());
        model.addAttribute("endPage", pager.getEndPage());
        return "patient_list";
    }
    
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model){
        model.addAttribute("patient", patientService.findOne(id));
        model.addAttribute("url", "/patient/edit/" + id);
        return "patient_form";
    }
    
    @PostMapping("/edit/{id}")
    public String update(@ModelAttribute @Valid Patient patient, 
            BindingResult bindingResult,
            @PathVariable("id") long id,
            Model model){
        if(bindingResult.hasErrors()){
            return "patient_form";
        }
        patientService.update(patient, id);
        return "redirect:/patient/list";
    }
    
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id){
        patientService.delete(id);
        return "redirect:/patient/list";
    }
}
