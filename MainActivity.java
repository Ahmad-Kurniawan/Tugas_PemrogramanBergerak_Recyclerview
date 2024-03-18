package com.example.recycleview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Nama> items = new ArrayList<Nama>();
        items.add(new Nama("Nama : Abmi Sukma Edri","Nim : 1205012o0341",R.drawable.abmi));
        items.add(new Nama("Nama : Ahmad Kurniawan","Nim : 12250111514",R.drawable.ahmad));
        items.add(new Nama("Nama : Aufa Hajati","Nim : 12250120338",R.drawable.aufa));
        items.add(new Nama("Nama : Daffa Finanda","Nim : 12250111603",R.drawable.finanda));
        items.add(new Nama("Nama : Daffa Ikhwan Nurfauzan","Nim : 12250110979",R.drawable.ikhwan));
        items.add(new Nama("Nama : Diki Afdol","Nim : 112250110383",R.drawable.z));
        items.add(new Nama("Nama : Dwi Jelita Adhliyah","Nim : 12250120331",R.drawable.jelita));
        items.add(new Nama("Nama : Dwi Mahdini","Nim : 12250111298",R.drawable.dwi));
        items.add(new Nama("Nama : Fajri","Nim : 1225011082",R.drawable.fajri));
        items.add(new Nama("Nama : Fakhri","Nim : 12250111381",R.drawable.fakhri));
        items.add(new Nama("Nama : Farras Lathief","Nim : 12250111328",R.drawable.farras));
        items.add(new Nama("Nama : Gilang Ramadhan Indra","Nim : 12250111323",R.drawable.gilang));
        items.add(new Nama("Nama : Hafidz Alhadid Rahman","Nim : 12250111794",R.drawable.hafidz));
        items.add(new Nama("Nama : Haritsah Naufaldy","Nim : 12250110361",R.drawable.aldy));
        items.add(new Nama("Nama : M. Nabil Dawami","Nim : 12250111527",R.drawable.nabil));
        items.add(new Nama("Nama : M. Zaki Erbay Syas","Nim : 12250111134",R.drawable.zaki));
        items.add(new Nama("Nama : M. Aditya Rinaldi","Nim : 12250111048",R.drawable.adit));
        items.add(new Nama("Nama : M. Dhimas Hadid","Nim : 12250111231",R.drawable.dhimas));
        items.add(new Nama("Nama : M. Faruq","Nim : 12250111791",R.drawable.faruq));
        items.add(new Nama("Nama : M. Rafly Wirayudha","Nim : 12250111489",R.drawable.rafly));
        items.add(new Nama("Nama : Nurika Dwi Wahyuni","Nim : 12250120360",R.drawable.nurika));
        items.add(new Nama("Nama : Ogya Secio Noegroho. s","Nim : 12250111346",R.drawable.ogi));
        items.add(new Nama("Nama : Rahma Laksita","Nim : 12250124357",R.drawable.rahma));
        items.add(new Nama("Nama : Raka Sabri","Nim : 12250110342",R.drawable.z));
        items.add(new Nama("Nama : Surya Hidayatullah Firdaus","Nim : 12250111759",R.drawable.surya));





        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new classPenghubung(getApplicationContext(),items));

    }
}