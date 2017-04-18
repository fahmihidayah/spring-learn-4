/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.spr4.service;

import com.widsons.spr4.domain.Disease;
import com.widsons.spr4.repository.DiseaseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fahmi
 */
@Service
@Transactional
public class DiseaseService {
    
    @Autowired
    DiseaseRepository diseaseRepository;
    
    public void save(Disease disease){
        diseaseRepository.save(disease);
    }
    
    public List<Disease> findAll(){
        return diseaseRepository.findAll();
    }
    
    public void delete(long id){
        diseaseRepository.delete(id);
    }
    
}
