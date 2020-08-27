package com.example.drcloudcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CashDonation extends AppCompatActivity {

    TextView mPaymentMethod;
    ImageView imageView;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_donation);
        mPaymentMethod = findViewById(R.id.payment_method);
        imageView = findViewById(R.id.img_bk_arrow);
        btnNext = findViewById(R.id.btn_donate);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CashDonation.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CashDonation.this, DonateFood.class);
                startActivity(intent);
                finish();
            }
        });
    }
}