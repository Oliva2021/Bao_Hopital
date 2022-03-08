package com.rh.projet.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="Chambre")
public class Chambre {

    @Autowired
    private String nom;
    private int id_categrie;
    
    public Chambre(){

    }
    
    public Chambre(int id_categrie,String nom){
        this.nom=nom;
    }

    public void setid_categorie(int id){
        this.id_categrie=id;
    }

    public void setnom(String nom){
        this.nom=nom;
    }

    public int getid_categorie(){
        return this.id_categrie;
    }
    public String getnom(){
        return this.nom;
    }
    




}




