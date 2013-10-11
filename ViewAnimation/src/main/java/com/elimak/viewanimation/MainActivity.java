package com.elimak.viewanimation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends Activity  implements View.OnClickListener {

    private Animation mAnimation;
    private View mAnimationTarget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAnimation = AnimationUtils.loadAnimation(this, R.anim.animation_set);
        mAnimationTarget = findViewById(R.id.animation_target);

        findViewById(R.id.button_animate).setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
          mAnimationTarget.startAnimation(mAnimation);
    }
}
