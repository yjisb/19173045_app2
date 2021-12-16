package com.example.myapplication_number;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerview);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        PersonAdepter adepter=new PersonAdepter();

        adepter.addItem(new Person("신예진","010-000-000"));
        adepter.addItem(new Person("2예진","010-111-111"));
        adepter.addItem(new Person("3예진","010-222-222"));

        recyclerView.setAdapter(adepter);
    }
}