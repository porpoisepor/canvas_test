package com.example.fonorio.canvastest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout rootView = findViewById(R.id.root_view);

        rootView.addView(new Rectangle(getApplicationContext()));
    }
}
