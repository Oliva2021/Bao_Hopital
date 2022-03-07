package java.com.rh.projet.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.com.rh.projet.repositories.DocteurRepository;
import java.com.rh.projet.entities.Docteur;

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
    public void Delete(DocteurEntities p){
        repo.deleteByid(p);
    } 
    public DocteurEntities Find(long id){
        return repo.findByid(id);
    }
}
