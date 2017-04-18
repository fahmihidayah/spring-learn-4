/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.service;

import com.widsons.spr4.domain.Patient;
import com.widsons.spr4.repository.PatientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fahmi
 */
@Transactional
@Service
public class PatientService {
    
    @Autowired
    PatientRepository patientRepository;
    
    public void save(Patient patient){
        patientRepository.save(patient);
    } 
    
    public Iterable<Patient> findAll(){
        return patientRepository.findAll();
    }
    
    public void delete(long id){
        patientRepository.delete(id);
    }
    
    public Patient findOne(long id){
        return patientRepository.findOne(id);
    }
    
    public void update(Patient patient, long id){
        patient.setId(id);
        save(patient);
    }
    
    public Page<Patient> findAllPage(Pageable pageable){
        return patientRepository.findAll(pageable);
    }
}
