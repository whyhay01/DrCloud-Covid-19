package com.example.drcloudcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CashDonation extends AppCompatActivity {

    TextView mPaymentMethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_donation);
        mPaymentMethod = findViewById(R.id.payment_method);
    }
}