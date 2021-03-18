package com.example.apple.gym;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apple.gym.MyAdapter;
import com.example.apple.gym.R;

import java.util.ArrayList;

public class Vipmain4 extends Fragment {
    //声明对象
    private RecyclerView rv;
    private ArrayList<String> datas;
    private MyAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.vip_main4,null);//引入布局文件
//        //初始化控件对象
//        rv = view.findViewById(R.id.rv);
//        //初始化数据集,在datas中存放从A到Z的26个字母
//        datas=new ArrayList<String>();
//        for(int i='A';i<='Z';i++){
//            datas.add((char)(i)+"");
//        }
//
//        //给rv设置adapter适配器（将viewHolder中的控件和数据源绑定在一起）
//        adapter= new MyAdapter(getActivity().getApplicationContext(),datas);
//        rv.setAdapter(adapter);
//        //通过layoutManager设置rv的显示风格
//        rv.setLayoutManager(new GridLayoutManager(getActivity().getApplicationContext(),3,GridLayoutManager.VERTICAL,false));//上下文，格数，方向，是否倒置
        return view;
    }
}
