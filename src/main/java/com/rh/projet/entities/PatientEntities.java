package com.rh.projet.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class PatientEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nom;
    String prenom;
    Date date_naissance;
    String sexe;
    String Photo;


    public PatientEntities(){

    }

    public PatientEntities(String nom,String prenom,Date d,String sexe,String Photo){
        
        this.nom=nom;
        this.prenom=prenom;
        this.date_naissance=d;
        this.sexe=sexe;
        this.Photo=Photo;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setnom(String nom){
        this.nom=nom;
    }
    
    public void setprenom(String prenom){
        this.prenom=prenom;
    }
    
    public void setdate(Date date){
        this.date_naissance=date;
    }
    public void setsexe(String sexe){
        this.sexe=sexe;
    }
    public void setphoto(String photo){
        this.Photo=photo;
    }

    public int getid(){
        return this.id;
    }
    public String getnom(){
        return this.nom;
    }
    public String getprenom(){
        return this.prenom;
    }
    public Date getdate(){
        return this.date_naissance;
    }
    public String getsexe(){
        return this.sexe;
    }
    public String getphoto(){
        return this.Photo;
    }

}
