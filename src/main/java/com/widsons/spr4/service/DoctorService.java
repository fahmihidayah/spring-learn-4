/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.service;

import com.widsons.spr4.domain.Doctor;
import com.widsons.spr4.domain.Role;
import com.widsons.spr4.domain.UserAccount;
import com.widsons.spr4.domain.model.UserAccountForm;
import com.widsons.spr4.repository.DoctorRepository;
import com.widsons.spr4.repository.RoleRepository;
import com.widsons.spr4.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fahmi
 */
@Service
@Transactional
public class DoctorService {
    
    @Autowired
    DoctorRepository doctorRepository;
    
    @Autowired
    UserAccountRepository userAccountRepository;
    
    @Autowired
    RoleRepository roleRepository;
    
    public void save(Doctor doctor, UserAccount userAccount){
        Role role = roleRepository.findOne(new Long(3));
        userAccount.getRoles().add(role);
        userAccountRepository.save(userAccount);
        doctor.setUserAccount(userAccount);
        doctorRepository.save(doctor);
    }
    
}
