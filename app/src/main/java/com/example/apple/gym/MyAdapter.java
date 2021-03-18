package com.example.apple.gym;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.apple.gym.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyViewHolder> {

    private Context context;
    private  ArrayList<String>datas;
    //MyAdapter构造函数,对成员变量context上下文，datas数据源赋值
    public MyAdapter(Context context, ArrayList<String> datas){
        this.context=context;
        this.datas=datas;
    }

    //通过adapter给viewholder中的控件设置监听器
    //1、声明监听器接口，声明事件处理函数
    public interface OnItemClickListener{
        void onItemClick(View view, int position);
        void onItemLongClick(View view, int position);
    }
    //2、声明监听器对象
    private OnItemClickListener listener;
    //3、定义设置监听器的set方法，供外界调用，给自己绑定监听器
    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener=listener;
    }

    //创建ViewHolder视图的容器
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        //将item布局文件转换为view对象加载进来
        View itemView=View.inflate(context, R.layout.item,null);
        return new MyViewHolder(itemView);
    }

    //将ViewHolder中的控件和数据源datas中的数据对应绑定在一起
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        String data=datas.get(position);
        holder.tv.setText(data);


        //4、设置监听器方法什么时候被触发
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(holder.itemView,position);
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                listener.onItemLongClick(holder.itemView,position);
                return false;
            }
        });
    }

    //返回数据源中数据的个数
    @Override
    public int getItemCount() {
        return datas.size();
    }

    //插入数据,更新数据源，通知adapter数据集发生了变化
    public void addDate(){
        datas.add(1,"new data");
        notifyItemInserted(1);
    }

    //删除数据
    public void deleteData(){
        datas.remove(1);
        notifyItemRemoved(1);

    }

    //viewHolder内部类
    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //将item.xml中的控件找出来，赋给viewHolder的成员变量
            tv=(TextView)itemView.findViewById(R.id.tv);

        }
    }
}
