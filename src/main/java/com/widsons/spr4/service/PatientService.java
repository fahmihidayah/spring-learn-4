/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.service;

import com.widsons.spr4.conf.Constantas;
import com.widsons.spr4.domain.Pager;
import com.widsons.spr4.domain.Patient;
import com.widsons.spr4.repository.PatientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    
    public Page<Patient> findAll(Optional<Integer> page, Optional<Integer> pageSize){
        int pageSizeResult = pageSize.orElse(Constantas.DEFAULT_PAGE_SIZE);
        int pageResult = (page.orElse(Constantas.DEFAULT_PAGE) < 1) ? 0 : page.get() - 1;
        return patientRepository.findAll(new PageRequest(pageResult, pageSizeResult));
    }
}
