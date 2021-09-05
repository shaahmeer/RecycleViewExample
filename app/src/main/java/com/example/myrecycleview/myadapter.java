package com.example.myrecycleview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder> {
    String[] data;





    public myadapter(String[] data ) {
        this.data = data;

    }




    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.newclass, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        holder.textView.setText(data[position]);
        System.out.println(data[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class myviewholder extends RecyclerView.ViewHolder {

        TextView textView,textView1;

        public myviewholder(@NonNull View itemView) {

            super(itemView);
            textView = itemView.findViewById(R.id.textviewv1);


        }
    }
}
