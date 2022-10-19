package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView img_makanandtl;
    TextView nama_makanandtl, deskripsi_makanandtl, harga_makanandtl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        img_makanandtl= findViewById(R.id.img_makanandtl);
        nama_makanandtl = findViewById(R.id.nama_makandtl);
        deskripsi_makanandtl = findViewById(R.id.deskripsi_makanandtl);
        harga_makanandtl = findViewById(R.id.harga_makanandtl);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("nama_makanan") && getIntent().hasExtra("harga_makanan") && getIntent().hasExtra("gambar_makanan")){
            Integer fotoMakanan = getIntent().getIntExtra("gambar_makanan", 0);
            String deskripsiMakanan = getIntent().getStringExtra("deskripsi_makanan");
            String namaMakanan = getIntent().getStringExtra("nama_makanan");
            String hargaMakanan = getIntent().getStringExtra("harga_makanan");
            Log.d("tes", namaMakanan);
            setDataActivity(fotoMakanan, namaMakanan, deskripsiMakanan, hargaMakanan);
        }
    }
        private void setDataActivity(Integer fotoMakanan, String namaMakanan, String deskripsiMakanan, String hargaMakanan){
            img_makanandtl.setImageResource(fotoMakanan);
            nama_makanandtl.setText(namaMakanan);
            deskripsi_makanandtl.setText(deskripsiMakanan);
            harga_makanandtl.setText("Harga : \t" +hargaMakanan);
    }
    }

