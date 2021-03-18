package com.example.apple.gym;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RadioButton;

public class VipMainActivity extends Activity{
    private FragmentManager manager;
    private FragmentTransaction transaction;
    //private Fragment fragment_title;
    //通过manager和transaction;来实现对fragment的动态操作

    private RadioButton radio1,radio2,radio3,radio4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//将app自带的标题去掉
        setContentView(R.layout.vip_main);

        //设置初始内容Fragment为我的页面
        manager=getFragmentManager();//获取管理器
        transaction=manager.beginTransaction();
        transaction.add(R.id.content_layout,new Vipmain4());//添加
        transaction.commit();//提交

        //初始化控件
        radio1=(RadioButton)findViewById(R.id.radioButton);
        radio2=(RadioButton)findViewById(R.id.radioButton2);
        radio3=(RadioButton)findViewById(R.id.radioButton3);
        radio4=(RadioButton)findViewById(R.id.radioButton4);

        RadioButtonListener listener=new RadioButtonListener();

        //给控件绑定监听器
        radio1.setOnClickListener(listener);
        radio2.setOnClickListener(listener);
        radio3.setOnClickListener(listener);
        radio4.setOnClickListener(listener);

    }
    //radioButton上绑定的监听器类
    class RadioButtonListener implements View.OnClickListener{
        @Override

        //当点击不同radioButton的时候，需要切换不同的Fragment
        public void onClick(View v) {
            transaction=manager.beginTransaction();
            switch (v.getId()){
                case R.id.radioButton:
                    transaction.replace(R.id.content_layout,new Vipmain1());
                    break;
                case R.id.radioButton2:
                    transaction.replace(R.id.content_layout,new Vipmain2());
                    break;
                case R.id.radioButton3:
                    transaction.replace(R.id.content_layout,new Vipmain3());
                    break;
                case R.id.radioButton4:
                    transaction.replace(R.id.content_layout,new Vipmain4());
                    break;

            }
            transaction.commit();
        }
    }
}
