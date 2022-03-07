package com.rh.projet.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Docteur")
public class DocteurEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nom;
    String idniveau;
    Date date_naissance;

    public DocteurEntities(){

    }


    public DocteurEntities(String nom,Date d,String idniveau){
        
        this.nom=nom;
        this.date_naissance=d;
        this.idniveau=idniveau;
    }

    public void setid(int id){
        this.id=id;
    }
    public void setnom(String nom){
        this.nom=nom;
    }
    
    public void setidniveau(String idniveau){
        this.idniveau=idniveau;
    }
    public void setdate(Date date){
        this.date_naissance=date;
    }

    public int getid(){
        return this.id;
    }

    public String getnom(){
        return this.nom;
    }

    public Date getdate(){
        return this.date_naissance;
    }

    public String getidniveau(){
        return this.idniveau;
    }
}
