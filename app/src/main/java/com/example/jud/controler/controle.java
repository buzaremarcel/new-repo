package com.example.jud.controler;

import android.content.Context;

import com.example.jud.model.AccesLocal;
import com.example.jud.model.Profil;

import java.util.Date;

public final class controle {

    private static controle instance = null;
    private static Profil profil;
    private static AccesLocal accesLocal;


    public controle() {
        super();
    }

    public static final controle getInstance(Context context) {
        if (controle.instance == null) {
            controle.instance = new controle();
            accesLocal=new AccesLocal(context);
            profil=accesLocal.recupDernier();
        }
        return controle.instance;
    }
    //public void creerProfil(String nom, String prenom, String mail, Integer numero){
    //  profil=new Profil(new Date(),nom, prenom, mail, numero);
//}

    public static void creerProfil(String strnom, String strprenom, String strmail, String strnumero) {
        profil=new Profil(new Date(),strnom, strprenom,strmail, strnumero);
        accesLocal.ajout(profil);
    }
}
