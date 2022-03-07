package com.rh.projet.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rh.projet.repositories.PatientRepository;
import com.rh.projet.entities.PatientEntities;

@Service
public class PatientService {

    @Autowired
   private PatientRepository repo;
    
    public List<PatientEntities> ListAll() {
        return repo.findAll().get();
    }
    public void Save(PatientEntities p){
         repo.save(p);
    }
    public void Delete(int p){
        repo.deleteById(p);
    } 
    public PatientEntities Find(int id){
        return repo.findByid(id);
    }
}
