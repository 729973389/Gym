package com.example.apple.gym;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.apple.gym.R;

import com.example.apple.gym.AdminDao;

public class MainActivity extends Activity {

    private Button btn_adminon,btn_vipon,btn_vipadd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化
        btn_adminon=(Button)findViewById(R.id.btn_adminon);
        btn_vipon=(Button)findViewById(R.id.btn_vipon);
        btn_vipadd=(Button)findViewById(R.id.btn_vipadd);
        AdminDao adminDao=new AdminDao(MainActivity.this);
        adminDao.insert();
        //给btn_adiminon添加监听器
        btn_adminon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AdminLoginActivity.class);
                //intent.putExtra("data","admin");//intent带数据
                startActivity(intent);
            }
        });

        //给btn_vipon添加监听器
        btn_vipon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,VipLoginActivity.class);
                //intent.putExtra("data","vip");//intent带数据
                startActivity(intent);
            }
        });

        //给btn_vipadd添加监听器
        btn_vipadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,VipAddAvtivity.class);
                startActivity(intent);
            }
        });
    }

}
