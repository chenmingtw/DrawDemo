package org.chenming.drawdemo;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

import org.chenming.drawdemo.view.CameraView;

public class GeometricCameraActivity extends AppCompatActivity {

    private CameraView cameraView;
    private SeekBar seekBarX;
    private SeekBar seekBarY;
    private SeekBar seekBarZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometric_camera);

        cameraView = findViewById(R.id.cameraView);
        cameraView.setBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.maps_256));
        cameraView.invalidate();

        seekBarX = findViewById(R.id.seekBar_rotateX);
        seekBarY = findViewById(R.id.seekBar_rotateY);
        seekBarZ = findViewById(R.id.seekBar_rotateZ);
        seekBarX.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                cameraView.setRotateX(progress);
                cameraView.invalidate();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarY.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                cameraView.setRotateY(progress);
                cameraView.invalidate();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarZ.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                cameraView.setRotateZ(progress);
                cameraView.invalidate();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
