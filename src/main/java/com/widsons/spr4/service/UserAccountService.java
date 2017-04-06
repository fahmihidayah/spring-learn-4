/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.service;

import com.widsons.spr4.domain.Role;
import com.widsons.spr4.domain.UserAccount;
import com.widsons.spr4.domain.model.UserAccountForm;
import com.widsons.spr4.repository.RoleRepository;
import com.widsons.spr4.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fahmi
 */
@Service
@Transactional
public class UserAccountService {
    
    @Autowired
    UserAccountRepository userAccountRepository;
    
    @Autowired
    RoleRepository roleRepository;
    
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    
    public void save(UserAccountForm userAccountForm){
        UserAccount userAccount = new UserAccount();
        userAccount.setPassword(bCryptPasswordEncoder.encode(userAccountForm.getPassword()));
        Role role = roleRepository.findOne(userAccountForm.getRoleId());
        userAccount.getRoles().add(role);
        userAccountRepository.save(userAccount);
    }
    
}
