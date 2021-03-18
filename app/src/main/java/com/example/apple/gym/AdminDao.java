package com.example.apple.gym;

import android.content.Context;

public class AdminDao {
    private GymSQLiteOpenHelper helper;
    public AdminDao(Context context){
        //初始化helper，从而数据库及数据表都有了
        helper=new GymSQLiteOpenHelper(context);
    }

    public void insert( ){

    }

}
