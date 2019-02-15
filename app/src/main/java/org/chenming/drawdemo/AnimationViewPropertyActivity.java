package org.chenming.drawdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AnimationViewPropertyActivity extends AppCompatActivity {

    private static final float moveDistance = 100;
    private static final float rotateAngle = 30;
    private static final float scale = 2;

    private Button btnScaleUpX;
    private Button btnScaleDownX;
    private Button btnScaleUpY;
    private Button btnScaleDownY;
    private ImageButton btnUp;
    private ImageButton btnDown;
    private ImageButton btnLeft;
    private ImageButton btnRight;
    private ImageButton btnRotateLeft;
    private ImageButton btnRotateRight;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_view_property);

        btnUp = findViewById(R.id.btnUp);
        btnDown = findViewById(R.id.btnDown);
        btnLeft = findViewById(R.id.btnLeft);
        btnRight = findViewById(R.id.btnRight);
        btnRotateLeft = findViewById(R.id.btnRotateLeft);
        btnRotateRight = findViewById(R.id.btnRotateRight);
        btnScaleUpX = findViewById(R.id.btnScaleUpX);
        btnScaleDownX = findViewById(R.id.btnScaleDownX);
        btnScaleUpY = findViewById(R.id.btnScaleUpY);
        btnScaleDownY = findViewById(R.id.btnScaleDownY);
        imageView = findViewById(R.id.image);

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.animate().translationXBy(-moveDistance);
            }
        });

        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.animate().translationXBy(moveDistance);
            }
        });

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.animate().translationYBy(-moveDistance);
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.animate().translationYBy(moveDistance);
            }
        });

        btnRotateLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.animate().rotationBy(-rotateAngle);
            }
        });

        btnRotateRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.animate().rotationBy(rotateAngle);
            }
        });

        btnScaleUpX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.animate().scaleXBy(scale);
            }
        });

        btnScaleDownX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.animate().scaleXBy(-scale);
            }
        });

        btnScaleUpY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.animate().scaleYBy(scale);
            }
        });

        btnScaleDownY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.animate().scaleYBy(-scale);
            }
        });
    }
}
