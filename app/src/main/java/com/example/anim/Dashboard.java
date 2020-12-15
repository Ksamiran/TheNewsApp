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

        aboutusbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent aboutus = new Intent(Dashboard.this, AboutUs.class);
                startActivity(aboutus);
            }
        });

    }
}