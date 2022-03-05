package com.example.robin.medicinalassistant;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME="ProfileManager";
    private static final String TABLE_NAME = "Profiles";
    private static final String KEY_ID="id";
    private static final String KEY_NAME = "name";
    private static final String KEY_DOCTOR = "doctor";
    private static final String KEY_HOSPITAL = "hospital";
    private static final String KEY_MEDICINES = "medicines";
    private static final String KEY_RECOMMENDED = "recommended";
    private static final String KEY_FORBIDDEN = "forbidden";

    public DatabaseHelper( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_PROFILE_TABLE = "CREATE TABLE " + TABLE_NAME + "(" + KEY_ID + " INTEGER PRIMARY KEY " +
                "AUTOINCREMENT," + KEY_NAME + " TEXT," + KEY_DOCTOR + " TEXT," + KEY_HOSPITAL + " TEXT,"
                + KEY_MEDICINES + " TEXT," + KEY_RECOMMENDED + " TEXT," + KEY_FORBIDDEN + " TEXT" + ")";
        db.execSQL(CREATE_PROFILE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
    void addprofile(Profile profile)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME,profile.getName());
        values.put(KEY_DOCTOR,profile.getDoctor());
        values.put(KEY_HOSPITAL,profile.getHospital());
        values.put(KEY_MEDICINES,profile.getMedicines());
        values.put(KEY_FORBIDDEN,profile.getForbidden());
        values.put(KEY_RECOMMENDED,profile.getRecommended());
        db.insert(TABLE_NAME,null,values);
        db.close();

    }
}
