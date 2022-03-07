package com.rh.projet.repositories;

import com.rh.projet.entities.PatientEntities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntities,Long> {
    
}
