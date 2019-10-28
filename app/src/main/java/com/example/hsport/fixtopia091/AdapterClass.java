package com.example.hsport.fixtopia091;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {
    ArrayList<Phone> list;
    Context context;

    public AdapterClass(ArrayList<Phone> list){
        this.list = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        View myView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myView = itemView;
            textView = myView.findViewById(R.id.tvPhoneSelectVer);

        }
    }

    @NonNull
    @Override
    public AdapterClass.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_select_problem, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.MyViewHolder myViewHolder, int i) {
        myViewHolder.textView.setText(list.get(i).getIphone());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
