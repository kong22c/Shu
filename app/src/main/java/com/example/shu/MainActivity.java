package com.example.shu;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mIv;
    private Button mBtn;
    private AnimatorSet set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initAlp();
    }

    private void initAlp() {
        set = new AnimatorSet();
        set.setDuration(3000);
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(mIv, "scaleY", 1, 2);
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(mIv, "Alpha", 0, 1);
        set.playTogether(scaleY,scaleX);

    }

    private void initViews() {
        mIv = findViewById(R.id.iv);
        mBtn = findViewById(R.id.btn);
        mBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        set.start();
    }
}
