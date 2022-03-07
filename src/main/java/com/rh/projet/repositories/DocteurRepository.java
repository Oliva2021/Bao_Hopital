package java.com.rh.projet.repositories;


import java.com.rh.projet.entities.Patient;

import org.springframework.data.jpa.Repository.jpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DocteurRepository extends jpaRepository<DocteurEntities,Long> {
    


    public PatientEntities WhichPatient(){
        
        String sql = "Select id,nom,prenom,date_naissance,sexe,id,nom from Patient,Maladie where id(Patient)=id(Maladie)";

    }
}
