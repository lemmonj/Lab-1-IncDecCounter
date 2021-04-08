package com.example.lab5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "memos.db";
    private static final String TABLE_MEMOS = "memos";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_MEMO = "name";

    public DatabaseHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_MEMOS_TABLE = "CREATE TABLE memos (_id integer primary key autoincrement, name text, address text)";
        db.execSQL(CREATE_MEMOS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEMOS);
        onCreate(db);
    }

    public void addMemo(Memo c) {

        ContentValues values = new ContentValues();
        values.put(COLUMN_MEMO, c.getMemo());

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_MEMOS, null, values);
        db.close();

    }
    public void deleteMemo(int id) {

        String query = "DELETE FROM " + TABLE_MEMOS + " WHERE " + COLUMN_ID + " = " + id;
        try {
            SQLiteDatabase db = this.getWritableDatabase();
            db.execSQL(query);

            db.close();
        }
        catch (Exception e){

        }

    }

    public Memo getMemo(int id) {

        String query = "SELECT * FROM " + TABLE_MEMOS + " WHERE " + COLUMN_ID + " = " + id;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Memo c = null;

        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            int newId = cursor.getInt(0);
            String newMemo = cursor.getString(1);
            cursor.close();
            c = new Memo(newId, newMemo);
        }

        db.close();
        return c;

    }

    public String getAllMemos() {

        String query = "SELECT * FROM " + TABLE_MEMOS;

        StringBuilder s = new StringBuilder();

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            do {
                int id = cursor.getInt(0);
                s.append(getMemo(id)).append("\n");
            }
            while ( cursor.moveToNext() );
        }

        db.close();
        return s.toString();
    }

    public List<Memo> viewMemosAsList(){

        List<Memo> allMemos= new ArrayList<>();

        String query = "SELECT * FROM " + TABLE_MEMOS;

        SQLiteDatabase db= this.getWritableDatabase();
        Cursor cursor= db.rawQuery(query, null);

        if (cursor.moveToFirst()) {
            cursor.moveToFirst();

            do {

                int id = cursor.getInt(0);
                String memo = cursor.getString(1);

                allMemos.add(new Memo(id, memo));

            }
            while ( cursor.moveToNext() );
        }

        db.close();
        return allMemos;

    }


}