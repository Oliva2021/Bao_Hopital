package com.rh.projet.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rh.projet.repositories.DocteurRepository;
import com.rh.projet.entities.DocteurEntities;

@Service
public class DocteurService {

    @Autowired
   private DocteurRepository repo;
    
    public List<DocteurEntities> ListAll() {
        return repo.findAll().get();
    }
    public void Save(DocteurEntities p){
         repo.save(p);
    }
    public void Delete(int p){
        repo.deleteById(p);
    } 
    public DocteurEntities Find(int id){
        return repo.findById(id);
    }
}
