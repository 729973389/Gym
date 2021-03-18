package com.example.apple.gym;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.apple.gym.R;

import java.util.ArrayList;

/**
 * Created by yangq on 2020/4/2.
 */

public class FlowAdapter extends RecyclerView.Adapter<FlowAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<String> datas;
    private ArrayList<Integer> heights;

    //MyAdapter构造函数,对成员变量context上下文，datas数据源赋值
    public FlowAdapter(Context context, ArrayList<String> datas){
        this.context=context;
        this.datas=datas;

        //随机初始化高度数组
        heights=new ArrayList<Integer>();
        for(int i=0;i<datas.size();i++){
            heights.add((int)(Math.random()*300+100));
        }
    }


    //创建ViewHolder视图的容器
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //将item布局文件转换为view对象加载进来
        View itemView=View.inflate(context, R.layout.item,null);
        return new MyViewHolder(itemView);
    }

    //将ViewHolder中的控件和数据源datas中的数据对应绑定在一起
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        String data=datas.get(position);
        holder.tv.setText(data);
        //给holder中的控件设置随机高度
        ViewGroup.LayoutParams lp=holder.tv.getLayoutParams();
        lp.height=heights.get(position);
        holder.tv.setLayoutParams(lp);

    }

    //返回数据源中数据的个数
    @Override
    public int getItemCount() {
        return datas.size();
    }

    //ViewHolder内部类
    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            //将item.xml中的控件找出来，赋给ViewHolder的成员变量
            tv=(TextView)itemView.findViewById(R.id.tv);
        }
    }
}
