package com.example.drcloudcovid_19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.drcloudcovid_19.DataFactory.makeGuideline;

public class CovidGuidelines extends AppCompatActivity {
    RecyclerView recyclerView;
    GuidelineAdapter adapter;
    ImageView backArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_guidelines);

        backArrow = findViewById(R.id.img_bk);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CovidGuidelines.this, ReliefFundSupport.class);
                startActivity(intent);
                finish();
            }
        });

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