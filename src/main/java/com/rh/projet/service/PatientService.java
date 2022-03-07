package java.com.rh.projet.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.com.rh.projet.repositories.PatientRepository;
import java.com.rh.projet.entities.Patient;

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
    public void Delete(PatientEntities p){
        repo.deleteByid(p);
    } 
    public PatientEntities Find(long id){
        return repo.findByid(id);
    }
}
