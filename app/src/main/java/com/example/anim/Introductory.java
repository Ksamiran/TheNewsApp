package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class Introductory extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    TextView appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_introductory);

        lottieAnimationView = findViewById(R.id.lottie);
        appName = findViewById(R.id.appname);

        lottieAnimationView.animate().translationY(-2000).setDuration(1000).setStartDelay(4000);
        appName.animate().translationY(2500).setDuration(1000).setStartDelay(4000);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //The code you want to run after the time is up
                if (haveNetwork()){
                    Intent dashboard = new Intent(Introductory.this, Dashboard.class);
                    startActivity(dashboard);
                    finish();
                }
                else if (!haveNetwork()){
                    Toast.makeText(Introductory.this, "NETWORK CONNECTION IS NOT AVAILABLE", Toast.LENGTH_SHORT).show();
                    Intent nointernet = new Intent(Introductory.this, NoNetwork.class);
                    startActivity(nointernet);
                    finish();
                }
            }
        }, 6500); //the time you want to delay in milliseconds

    }
    private boolean haveNetwork(){
        boolean have_WIFI = false;
        boolean have_MobileData = false;

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo[] networkInfos=connectivityManager.getAllNetworkInfo();

        for (NetworkInfo info:networkInfos){
            if (info.getTypeName().equalsIgnoreCase("WIFI"))
                if (info.isConnected())
                    have_WIFI = true;
            if (info.getTypeName().equalsIgnoreCase("MOBILE"))
                if (info.isConnected())
                    have_MobileData = true;
        }
        return have_MobileData || have_WIFI;
    }
}