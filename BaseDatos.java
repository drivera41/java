package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {

    private static final String NOMBRE_DB="lugarescomidas.db";
    private static final int VERSION_BD=1;
    private static final String TABLA_COMIDAS="CREATE TABLE COMIDAS(CODIGO TEXT PRIMARY KEY, NOMBRE TEXT, DESCRIPCION TEXT)";

    public BaseDatos(Context context) {
        super(context, NOMBRE_DB, null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_COMIDAS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLA_COMIDAS);
        sqLiteDatabase.execSQL(TABLA_COMIDAS);
    }

    public void agregarLugarComida(String codigo, String nombre, String descripcion){
        SQLiteDatabase bd = getWritableDatabase();
        if(bd!=null){
            bd.execSQL("INSERT INTO COMIDAS VALUES('"+codigo+"','"+nombre+"','"+descripcion+"')");
            bd.close();

        }

    }
}

