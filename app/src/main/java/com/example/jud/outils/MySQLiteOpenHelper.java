package com.example.jud.outils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySQLiteOpenHelper extends SQLiteOpenHelper {
    //propriete
    private String creation="create table profile("
            +"dateMesure TEXT PRIMARY KEY,"
            +"strnom TEXT NOT NULL,"
            +"strprenom TEXT NOT NULL,"
            + "strmail TEXT NOT NULL,"
            +"strnumero TEXT NOT NULL"+");";
    /**
     * constructeur
     * @param context
     * @param name
     * @param factory
     * @param version
     */
    public MySQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(creation);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
