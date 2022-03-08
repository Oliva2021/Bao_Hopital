package com.rh.projet.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="Niveau")
public class Niveau {
    
    @Autowired
    private String Nom;
    private String Niveau;

    public Niveau(){

    }

    public Niveau(String nom,String niveau){

        this.Nom=nom;
        this.Niveau=niveau;
    }

    public void setnom(String nom){
        this.Nom=nom;
    }
    public void setniveau(String niveau){
        this.Niveau=niveau;
    }

    public String getnom(){
        return this.Nom;
    }
    public String getniveau(){
        return this.Niveau;
    }
}
