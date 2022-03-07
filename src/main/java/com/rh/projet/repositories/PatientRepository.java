package java.com.rh.projet.repositories;

import projet.hopital.Model.Patient;
import org.springframework.data.jpa.Repository.jpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends jpaRepository<PatientEntities,Long> {
    
}
