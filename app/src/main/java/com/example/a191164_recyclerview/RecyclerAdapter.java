package com.example.a191164_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context context;
    List<marvel> data;

    public RecyclerAdapter() {
    }

    public RecyclerAdapter(Context context, List<marvel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {

        marvel m = data.get(position);
        holder.textView1.setText("Name: " + m.getStr());
        holder.textView2.setText("YEAR: " + m.getYear());
        holder.textView3.setText("Rating: " + m.getRating());

        holder.textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "clicked on: " + data.get(position).getStr(), Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener {
        TextView textView1, textView2, textView3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.tv_rv_Marvel);
            textView2 = itemView.findViewById(R.id.tv_rv_year);
            textView3 = itemView.findViewById(R.id.tv_rv_rating);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public boolean onLongClick(View v) {
            int position = getAdapterPosition();
            Toast.makeText(itemView.getContext(), "DELETED " + data.get(position).getStr(), Toast.LENGTH_LONG).show();
            data.remove(position);
            notifyItemRemoved(position);
            return true;
        }

    }
}
