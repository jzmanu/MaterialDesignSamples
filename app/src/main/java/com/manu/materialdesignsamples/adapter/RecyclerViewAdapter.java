package com.manu.materialdesignsamples.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.manu.materialdesignsamples.R;

import java.util.ArrayList;

/**
 * Created by jzman
 * Powered by 2018/5/19 0019.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private Context context;
    private ArrayList<String> list;

    public RecyclerViewAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,null);
        view.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof DataViewHolder)
            ((DataViewHolder) holder).tvData.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder{
        TextView tvData;
        public DataViewHolder(View itemView) {
            super(itemView);
            tvData = itemView.findViewById(R.id.tvData);
        }
    }
}
