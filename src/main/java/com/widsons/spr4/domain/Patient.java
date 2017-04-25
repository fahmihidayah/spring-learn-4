/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author fahmi
 */
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue
    private long id;
    @Column
    @NotNull
    @NotEmpty
    private String name;
    @Column
    @NotNull
    @NotEmpty
    private String address;
    @Column
    @NotNull
    @NotEmpty
    @Pattern(regexp="^(0|[1-9][0-9]*)$", message = "Not valid phone number")
    private String phoneNumber;
    
    @ManyToMany(mappedBy = "patients")
    private Set<Doctor> doctors = new HashSet<>();
    
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private Set<DiseaseHistory> diseaseHistorys = new HashSet<>();

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

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Set<DiseaseHistory> getDiseaseHistorys() {
        return diseaseHistorys;
    }

    public void setDiseaseHistorys(Set<DiseaseHistory> diseaseHistorys) {
        this.diseaseHistorys = diseaseHistorys;
    }
    
    public void setValue(Patient patient){
        this.name = patient.name;
        this.address = patient.address;
        this.phoneNumber = patient.phoneNumber;
    }
   
    
}
