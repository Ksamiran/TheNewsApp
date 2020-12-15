package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class AboutUs extends AppCompatActivity {

    TextView mail, fb, tweet, yt;
    ImageView mail1, fb1, tweet1, yt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        mail = findViewById(R.id.emailText);
        fb = findViewById(R.id.facebookText);
        tweet = findViewById(R.id.twitterText);
        yt = findViewById(R.id.ytText);

        mail1 = findViewById(R.id.emailImage);
        fb1 = findViewById(R.id.facebookImage);
        tweet1 = findViewById(R.id.twitterImage);
        yt1 = findViewById(R.id.ytImage);

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://mail.google.com/mail/?view=cm&fs=1&to=thenewsapp@gmail.com");
            }
        });

        mail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://mail.google.com/mail/?view=cm&fs=1&to=thenewsapp@gmail.com");
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://www.facebook.com/Genshinimpact");
            }
        });

        fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://www.facebook.com/Genshinimpact");
            }
        });

        tweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://twitter.com/Subroza");
            }
        });

        tweet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://twitter.com/Subroza");
            }
        });

        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
            }
        });

        yt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
            }
        });
    }

    private void gotoURL(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}