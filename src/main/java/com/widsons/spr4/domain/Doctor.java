/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author fahmi
 */
@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String phoneNumber;
    
    @OneToOne(cascade = CascadeType.ALL)
    private UserAccount userAccount;
    
    @ManyToMany
    @JoinTable(name = "doctor_patient",
            joinColumns = { @JoinColumn(name = "doctor_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "patient_id", referencedColumnName = "id")})
    private Set<Patient> patients = new HashSet<>();

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    
    
}
