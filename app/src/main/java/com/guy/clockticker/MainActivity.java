package com.guy.clockticker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.guy.mct.MCT5;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MCT5.get().cycle(new MCT5.CycleTicker() {
            @Override
            public void secondly(int repeatsRemaining) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("pttt", "Hi");
                    }
                });
            }

            @Override
            public void done() {

            }
        }, MCT5.CONTINUOUSLY_REPEATS, 1000, "MainActivity");
    }
}