package com.example.drcloudcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ReliefFundSupport extends AppCompatActivity {
    ImageView backArrow;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relief_fund_support);
        backArrow = findViewById(R.id.bk_arrow);
        button = findViewById(R.id.button);

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReliefFundSupport.this, DonateFood.class);
                startActivity(intent);
                finish();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReliefFundSupport.this, CovidGuidelines.class);
                startActivity(intent);
            }
        });
    }
}