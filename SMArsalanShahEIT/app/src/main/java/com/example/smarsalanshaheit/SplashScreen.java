package com.example.smarsalanshaheit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    ProgressBar  p2;

    int i = 0;
    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        p2 = findViewById(R.id.progressBar2);

        i = p2.getProgress();//initial
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (i < 100) {
                    i += 1;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {

                            p2.setProgress(i);

                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Intent intent = new Intent(SplashScreen.this, Login.class);

                                    startActivity(intent);
                                }
                            },5000);
                        }
                    });
                    try {
                        Thread.sleep(100);


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }


            }
        }).start();


    }
    }
