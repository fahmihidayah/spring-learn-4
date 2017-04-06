/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.repository;

import com.widsons.spr4.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fahmi
 */
@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
    public UserAccount findByUserName(String userName);
    
}
