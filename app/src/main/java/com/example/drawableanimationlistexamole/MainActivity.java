package com.example.drawableanimationlistexamole;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnStart, btnStop;
    ImageView image;
    AnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.btn_activity_main___1);
        btnStop = findViewById(R.id.btn_activity_main___2);
        image = findViewById(R.id.image_anim);

        anim = (AnimationDrawable) image.getBackground();

        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_activity_main___1:
                anim.start();
                break;
            case R.id.btn_activity_main___2:
                anim.stop();
                break;
        }
    }
}
