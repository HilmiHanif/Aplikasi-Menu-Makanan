package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView menu_makanan = findViewById(R.id.menu_makanan);
        ArrayList<Makanan>semua_makanan = new ArrayList<>();
        menu_makanan.setAdapter(new Adapter(semua_makanan, this));
        semua_makanan.add(new Makanan("Ayam Geprek", "12000","Ayam Geprek jakarta Sambal ijo ",R.drawable.ayamgeprek ));
        semua_makanan.add(new Makanan("Nasi Goreng", "10000","Nasi Goreng Spesial sosis",R.drawable.nasgor));
        semua_makanan.add(new Makanan("Soto", "8000","Soto Buthek khas betawi",R.drawable.soto));
        semua_makanan.add(new Makanan("Mie Ayam", "13000","Mie Ayam yamin toping jamur dan ceker",R.drawable.mieayam));
        semua_makanan.add(new Makanan("Bakso", "15000","Bakso lava beranak spesial",R.drawable.bakso));

        menu_makanan.setLayoutManager(new GridLayoutManager(this, 2));
    }
}