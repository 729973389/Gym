package com.example.apple.gym;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.example.apple.gym.MyAdapter;
import com.example.apple.gym.R;

import java.util.ArrayList;

public class Vipmain1 extends Fragment{

    //声明对象
    private RecyclerView rv;
    private ArrayList<String> datas;
    private MyAdapter adapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.vip_main1,null);//引入布局文件

        //初始化控件对象
        rv = view.findViewById(R.id.rv);
        //初始化数据集,在datas中存放从A到Z的26个字母
        datas=new ArrayList<String>();
        for(int i='A';i<='Z';i++){
            datas.add((char)(i)+"");
        }

        //给rv设置adapter适配器（将viewHolder中的控件和数据源绑定在一起）
        adapter= new MyAdapter(getActivity().getApplicationContext(),datas);
        rv.setAdapter(adapter);
        //通过layoutManager设置rv的显示风格
        //rv.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));//上下文，方向，是否倒置

        //StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        //rv.setLayoutManager(manager);
        //adapter=new FlowAdapter(datas);
        //rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        return view;
    }


}
