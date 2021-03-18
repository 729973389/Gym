package com.example.apple.gym;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.apple.gym.R;

public class VipLoginActivity extends Activity {
    private Button btn_login;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vip_login);

        //初始化
        btn_login=(Button)findViewById(R.id.btn_login);

        //给btn_login添加监听器
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VipLoginActivity.this,VipMainActivity.class);
                //intent.putExtra("data","admin");//intent带数据
                startActivity(intent);
            }
        });
    }
}
