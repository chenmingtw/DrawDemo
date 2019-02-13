package org.chenming.drawdemo;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.chenming.drawdemo.view.CircleProgressView;

public class AnimationObjectAnimatorActivity extends AppCompatActivity {

    private CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_object_animator);

        circleProgressView = findViewById(R.id.circleProgressView);

        Keyframe keyframe1 = Keyframe.ofFloat(0, 0);
        Keyframe keyframe2 = Keyframe.ofFloat(0.5f, 100);
        Keyframe keyframe3 = Keyframe.ofFloat(1, 80);

        PropertyValuesHolder holder = PropertyValuesHolder.ofKeyframe("progress", keyframe1, keyframe2, keyframe3);
        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(circleProgressView, holder);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setDuration(2000)
                .start();
    }
}
