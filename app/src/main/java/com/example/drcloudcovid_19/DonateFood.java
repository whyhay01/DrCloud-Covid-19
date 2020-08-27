package com.example.drcloudcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DonateFood extends AppCompatActivity {
    TextView txt_submit;
    CheckBox isChecked;
    ImageView img_bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_food);
        txt_submit = findViewById(R.id.txt_submit);
        isChecked = findViewById(R.id.checkBox);
        img_bck = findViewById(R.id.img_back);

        txt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isChecked.isChecked()){
                    Intent intent = new Intent(DonateFood.this, ReliefFundSupport.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(getApplicationContext(), "Click the checkbox",Toast.LENGTH_SHORT).show();
                }

            }
        });

        img_bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(DonateFood.this, CashDonation.class);
                startActivity(intentBack);
                finish();
            }
        });
    }

}