package com.example.sampleanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button scale_btn = (Button) findViewById(R.id.scale_btn);
        scale_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                view.startAnimation(anim);
            }
        });

        Button alpha_btn = (Button) findViewById(R.id.alpha_btn);
        alpha_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                view.startAnimation(anim);
            }
        });

        Button translate_btn = (Button) findViewById(R.id.translate_btn);
        translate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
                view.startAnimation(anim);
            }
        });

        Button rotate_btn = (Button) findViewById(R.id.rotate_btn);
        rotate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                view.startAnimation(anim);
            }
        });
    }
}
