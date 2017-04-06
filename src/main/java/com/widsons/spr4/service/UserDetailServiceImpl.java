/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.service;

import com.widsons.spr4.domain.Role;
import com.widsons.spr4.domain.UserAccount;
import com.widsons.spr4.repository.UserAccountRepository;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author fahmi
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService{

    @Autowired
    UserAccountRepository userAccountRepository;
    
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserAccount userAccount = userAccountRepository.findByUserName(userName);
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        for(Role role : userAccount.getRoles()){
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new User(userAccount.getUserName(), userAccount.getPassword(), authorities);
    }
    
}
