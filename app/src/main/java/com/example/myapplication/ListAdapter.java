package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ItemViewHold> {
    private  List<String> dataList;
    private  Context context;

    ListAdapter(Context context, List<String> dataList){
        this.context=context;
        this.dataList=dataList;
    }

    @NonNull
    @Override
    public ItemViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView= LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ItemViewHold(itemView);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHold holder, int position) {

        holder.tv.setText("-->"+dataList.get(position));
    }

    class  ItemViewHold extends RecyclerView.ViewHolder{
        private TextView tv;

        public ItemViewHold(@NonNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.tv);
        }
    }
}
