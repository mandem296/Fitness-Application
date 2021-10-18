package com.madfitness.fitness.Ex_activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.madfitness.fitness.R;

public class SplashScreen extends AppCompatActivity {

    class ThreadName extends Thread {
        ThreadName() {
        }

        public void run() {
            try {
                ThreadName.sleep(1000);
                SplashScreen.this.startActivity(new Intent(SplashScreen.this.getApplicationContext(), MainActivity.class));
                SplashScreen.this.finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.exec_splash_screen);
        new ThreadName().start();
    }
}
