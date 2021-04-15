package com.example.jud.model;

import java.util.Date;
import java.sql.Time;

public class Profil {
    //propriete
    private Date dateMesure;
    private String nom;
    private String prenom;
    private String mail;
    private String numero;
    private Time heure;
    private Date date;

    public Profil(Date dateMesure,String strnom, String strprenom, String strmail, String strnumero) {
        this.dateMesure=dateMesure;
        this.nom = strnom;
        this.prenom = strprenom;
        this.mail = strmail;
        this.numero = strnumero;
    }



    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getNumero() {
        return numero;
    }

    public Date getDateMesure() {
        return dateMesure;
    }
}
