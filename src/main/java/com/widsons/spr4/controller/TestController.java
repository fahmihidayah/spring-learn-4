/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.controller;

import com.widsons.spr4.domain.Doctor;
import com.widsons.spr4.domain.Patient;
import com.widsons.spr4.domain.UserAccount;
import com.widsons.spr4.domain.model.ListUserResponse;
import com.widsons.spr4.repository.UserAccountRepository;
import com.widsons.spr4.service.PatientService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fahmi
 */
@RestController
@RequestMapping(value = "api/test")
public class TestController {
    
    @Autowired
    UserAccountRepository userAccountRepository;
    
    @Autowired
    PatientService patientService;
    
    @GetMapping("/users")
    public ListUserResponse getUsers(){
        return new ListUserResponse().setUserAccounts(Arrays.asList(
                userAccountRepository.findByUserName("fahmi")
        ));
    }
    
    @GetMapping("/patient")
    public Page<Patient> getPatient(){
        return null;
//        return patientService.findAllPage(new PageRequest(1, 5));
    }
    
    
    
    
}
