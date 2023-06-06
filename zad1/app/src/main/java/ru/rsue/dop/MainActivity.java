package ru.rsue.dop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView sunImageView =(ImageView)findViewById(R.id.sun);
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this,R.anim.sunrise);
       sunImageView.startAnimation(sunRiseAnimation);
    }
}