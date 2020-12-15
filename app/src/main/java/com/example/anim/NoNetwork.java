package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class NoNetwork extends AppCompatActivity {

    LottieAnimationView lottieAnimationView1;
    Button retrybutton, leavebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_network);

        lottieAnimationView1 = findViewById(R.id.lottie1);

        retrybutton = findViewById(R.id.button1);
        leavebutton = findViewById(R.id.button2);

        retrybutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent retry = new Intent(NoNetwork.this, Introductory.class);
                startActivity(retry);
                finish();
            }
        });

        leavebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                finish();
                System.exit(0);
            }
        });
    }
}