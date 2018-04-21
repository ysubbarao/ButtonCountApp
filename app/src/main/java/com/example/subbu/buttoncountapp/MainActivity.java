package com.example.subbu.buttoncountapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    TextView clickCountText;
    Button increment_button;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickCountText = (TextView) findViewById(R.id.click_count_text);
        increment_button =(Button) findViewById(R.id.increment_button);

        Log.d(TAG,"--onCreate--clickCountText--value"+count);
        increment_button.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"--onStart--clickCountText--value"+count);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"--onPause--clickCountText--value"+count);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"--onResume--clickCountText--value"+count);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"--onStop--clickCountText--value"+count);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"--onDestroy--clickCountText--value"+count);
    }

    @Override
    public void onClick(View v) {

        if (v == increment_button) {
            count++;

            clickCountText.setText(Integer.toString(count));

        }
    }
}