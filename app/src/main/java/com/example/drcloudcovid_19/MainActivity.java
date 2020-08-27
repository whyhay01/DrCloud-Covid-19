package com.example.drcloudcovid_19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.drcloudcovid_19.DataFactory.makeJourney;

public class MainActivity extends AppCompatActivity {

    MyAdapter adapter;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    Button btnNextPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_expandable);
        btnNextPage = findViewById(R.id.btn_journey);

        btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CashDonation.class);
                startActivity(intent);
                finish();
            }
        });

        adapter = new MyAdapter(makeJourney());
        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);





    }
}