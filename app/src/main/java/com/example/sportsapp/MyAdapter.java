package com.example.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.sportsapp.data.model.Sports;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CustomViewHolder> {

    private List<Sports.SportsData> dataList;

    public MyAdapter(List<Sports.SportsData> dataList){
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        //Get a reference to the Views in our layout//

        public final View myView;

        TextView textSport;

        CustomViewHolder(View itemView) {
            super(itemView);
            myView = itemView;
            textSport = myView.findViewById(R.id.sport);
        }
    }


    //Construct a RecyclerView.ViewHolder//
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layout, parent, false);
        return new CustomViewHolder(view);
    }

    //Set the data//
    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.textSport.setText(dataList.get(position).getSport());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}

