package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class classPenghubung extends RecyclerView.Adapter<Tampilan> {


    Context context;
    List<Nama> items;

    public classPenghubung(Context context, List<Nama> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public Tampilan onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new Tampilan(LayoutInflater.from(context).inflate(R.layout.nama_tampilan,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Tampilan holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.nimView.setText(items.get(position).getNim());
        holder.imageView.setImageResource(items.get(position).getimage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
