package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    Button govbutton, codebutton, genbutton, aboutusbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        aboutusbutton = findViewById(R.id.about);
        govbutton = findViewById(R.id.gov);
        codebutton = findViewById(R.id.coding);
        genbutton = findViewById(R.id.general);

        aboutusbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent aboutus = new Intent(Dashboard.this, AboutUs.class);
                startActivity(aboutus);
            }
        });

        govbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent goverment = new Intent(Dashboard.this, GovActivity.class);
                startActivity(goverment);
            }
        });

        codebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent coding = new Intent(Dashboard.this, CodeActivity.class);
                startActivity(coding);
            }
        });
        
        genbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent general = new Intent(Dashboard.this, GeneralActivity.class);
                startActivity(general);
            }
        });
    }
}
