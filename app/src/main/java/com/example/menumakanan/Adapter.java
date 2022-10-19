package com.example.menumakanan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    private ArrayList<Makanan> semua_makanan;
    private Context context;

    public Adapter(ArrayList<Makanan> semua_makanan, Context context) {
        this.semua_makanan = semua_makanan;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_makanan, parent,false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.Holder holder, int position) {
        Makanan makanan = semua_makanan.get(position);
        holder.nama_makanan.setText(makanan.getNama_makanan());
        holder.harga_makanan.setText(makanan.getHarga_makanan());
        holder.img_makanan.setImageResource(makanan.getImg_makanan());

        holder.btn_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("nama_makanan", makanan.getNama_makanan());
                intent.putExtra("deskripsi_makanan", makanan.getDeskripsi_makanan());
                intent.putExtra("harga_makanan", makanan.getHarga_makanan());
                intent.putExtra("gambar_makanan", makanan.getImg_makanan());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return semua_makanan.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        public TextView nama_makanan, harga_makanan, deskripsi_makanan;
        public ImageView img_makanan;
        public Button btn_detail;
        public Holder(@NonNull View itemView) {
            super(itemView);

            nama_makanan = itemView.findViewById(R.id.nama_makanan);
            harga_makanan = itemView.findViewById(R.id.harga_makanan);
            img_makanan = itemView.findViewById(R.id.img_makanan);
            btn_detail = itemView.findViewById(R.id.btn_detail);
            deskripsi_makanan = itemView.findViewById(R.id.deskripsi_makanandtl);
        }
    }
}
