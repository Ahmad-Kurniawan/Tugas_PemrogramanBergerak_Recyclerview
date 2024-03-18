package com.example.recycleview;

public class Nama {
    String nama;
    String nim;
    int Foto;

    public Nama(String name, String nim, int image) {
        this.nama = name;
        this.nim = nim;
        this.Foto = image;
    }

    public String getName() {
        return nama;
    }

    public void setName(String name) {
        this.nama = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getimage() {
        return Foto;
    }

    public void setImage(int image) {
        this.Foto = image;
    }
}
