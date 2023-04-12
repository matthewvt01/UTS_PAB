package com.si6a.uts.uts_pab_matthew;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    private Context ctx;
    private static final String DATABASE_NAME = "db_kampus_0040";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "tbl_kampus_0040";
    private static final String FIELD_ID = "id";
    private static final String FIELD_NAMA = "nama";
    private static final String FIELD_KOTA = "kota";
    private static final String FIELD_ALAMAT = "alamat";

    public MyDatabaseHelper(@Nullable Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.ctx = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE" + TABLE_NAME + " ("+
                FIELD_ID + " INTEGER PRIMARY KEY AUTOINCEMENT, "+
                FIELD_NAMA + " TEXT, " +
                FIELD_KOTA + " TEXT, " +
                FIELD_ALAMAT + " TEXT ); ";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }
    public long tambahkampus(String nama, String kota, String alamat){

    }
}
