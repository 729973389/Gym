package com.example.apple.gym;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class GymSQLiteOpenHelper extends SQLiteOpenHelper{
    public GymSQLiteOpenHelper(Context context) {
        //创建数据库
        super(context, "gym.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建数据表
        db.execSQL("create table Admin(" +"AdminId Integer primary key autoincrement,"
                +"AdminLevel Integer," +"AdminUser varchar(50),"
                +"AdminPassword varchar(50))");
        db.execSQL("create table Vip(" +"VipId Integer primary key autoincrement,"
                +"Level varchar(50)," +"VipName varchar(50),"
                +"VipPassword varchar(50),"+"Sex Integer,"
                +"Tel varchar(50)," +"Birth varchar(50),"
                +"Email varchar(50),"+"Image varchar(50))");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
