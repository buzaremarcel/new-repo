package com.example.jud.model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.jud.outils.MySQLiteOpenHelper;

import java.util.Date;

public class AccesLocal {


    //proprite
    private String nomBase="bdCoach.sqlite";
    private  Integer versionBase=1;
    private MySQLiteOpenHelper accesBD;
    private SQLiteDatabase bd;
    /*
    constructeur
     */
    public AccesLocal(Context contexte){
        accesBD=new MySQLiteOpenHelper(contexte,nomBase,null,versionBase);
    }
    public void ajout(Profil profil){
        bd=accesBD.getWritableDatabase();
        String req="insert into profil(dateMesure,strnom,strprenom,strmail,strnumero)values(\""+profil.getDateMesure()+"\",\""+profil.getNom()+"\",\""+profil.getPrenom()+"\",\""+profil.getMail()+"\",\""+profil.getNumero()+"\")";
        bd.execSQL(req);
    }
    public  Profil recupDernier(){
        bd=accesBD.getReadableDatabase();
        Profil profil=null;

        String req="select * from profil";
        Cursor curseur=bd.rawQuery(req,null);
        curseur.moveToLast();
        if(curseur.isAfterLast()){
            Date date=new Date();
            String dateMesure=curseur.getString(1);
            String strnom=curseur.getString(2);
            String strprenom=curseur.getString(3);
            String strmail=curseur.getString(4);
            String strnumero=curseur.getString(5);
            profil=new Profil(date,strnom,strprenom,strmail,strnumero);
        }
        curseur.close();
        return profil;
    }


}
