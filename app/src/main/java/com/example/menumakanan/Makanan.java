package com.example.menumakanan;

import java.io.Serializable;

public class Makanan implements Serializable {
    private String nama_makanan, harga_makanan, deskripsi_makanan;
    private int img_makanan;

    public Makanan(String nama_makanan, String harga_makanan, String deskripsi_makanan, int img_makanan) {
        this.nama_makanan = nama_makanan;
        this.harga_makanan = harga_makanan;
        this.deskripsi_makanan = deskripsi_makanan;
        this.img_makanan = img_makanan;
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public String getHarga_makanan() {
        return harga_makanan;
    }

    public void setHarga_makanan(String harga_makanan) {
        this.harga_makanan = harga_makanan;
    }

    public String getDeskripsi_makanan() {
        return deskripsi_makanan;
    }

    public void setDeskripsi_makanan(String deskripsi_makanan) {
        this.deskripsi_makanan = deskripsi_makanan;
    }

    public int getImg_makanan() {
        return img_makanan;
    }

    public void setImg_makanan(int img_makanan) {
        this.img_makanan = img_makanan;
    }
}
