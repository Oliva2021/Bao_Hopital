package com.rh.projet.repositories;



import com.rh.projet.entities.DocteurEntities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DocteurRepository extends JpaRepository<DocteurEntities,Long> {
    


 
}
