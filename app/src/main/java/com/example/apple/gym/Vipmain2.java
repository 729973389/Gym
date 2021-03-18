package com.example.apple.gym;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.example.apple.gym.FlowAdapter;
import com.example.apple.gym.R;

import java.util.ArrayList;

public class Vipmain2 extends Fragment {
    //声明对象
    private RecyclerView rv;
    private ArrayList<String> datas;
    private FlowAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.vip_main2,null);//引入布局文件


        //初始化控件对象
        rv = view.findViewById(R.id.rv);
        //初始化数据集,在datas中存放从A到Z的26个字母
        datas=new ArrayList<String>();
        for(int i='A';i<='Z';i++){
            datas.add((char)(i)+"");
        }

        //给rv设置adapter适配器（将viewHolder中的控件和数据源绑定在一起）
        adapter= new FlowAdapter(getActivity().getApplicationContext(),datas);
        rv.setAdapter(adapter);
        //通过layoutManager设置rv的显示风格
        //flow瀑布流显示，StaggeredGridLayoutManager
        //rv.setLayoutManager(new StaggeredGridLayoutManager(5,StaggeredGridLayoutManager.VERTICAL));
        //跳转到FlowActivity（专门显示瀑布流效果的界面）
        rv.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));//几列，方向(瀑布流)
        //startActivity(intent);

        return view;
    }
}
