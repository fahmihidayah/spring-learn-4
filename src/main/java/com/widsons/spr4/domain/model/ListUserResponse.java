/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.domain.model;

import com.widsons.spr4.domain.Role;
import com.widsons.spr4.domain.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fahmi
 */
public class ListUserResponse extends BaseResponse{
    
    private List<User> users = new ArrayList<>();
    
    public class User{
        private String userName;
        private List<String> roles = new ArrayList<>();

        public User(UserAccount userAccount) {
            userName = userAccount.getUserName();
            for(Role role : userAccount.getRoles()){
                roles.add(role.getName());
            }
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }
        
        
    }

    public ListUserResponse setUserAccounts(List<UserAccount> users) {
        for(UserAccount userAccount : users){
            this.users.add(new User(userAccount));
        }
        return this;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    
    
    
    
}
