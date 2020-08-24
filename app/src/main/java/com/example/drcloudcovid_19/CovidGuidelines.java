package com.example.drcloudcovid_19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import static com.example.drcloudcovid_19.DataFactory.makeGuideline;

public class CovidGuidelines extends AppCompatActivity {
    RecyclerView recyclerView;
    GuidelineAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_guidelines);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setTitle(getClass().getSimpleName());

        recyclerView = findViewById(R.id.rv_guideline);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        adapter = new GuidelineAdapter(makeGuideline());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        RecyclerView.ItemAnimator animator = recyclerView.getItemAnimator();
        if (animator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) animator).setSupportsChangeAnimations(false);
        }
    }
}