package org.chenming.drawdemo.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CameraView extends View {

    private float rotateX = 0;
    private float rotateY = 0;
    private float rotateZ = 0;

    private Bitmap bitmap = null;

    public CameraView(Context context) {
        super(context);
    }

    public CameraView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CameraView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CameraView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Camera camera = new Camera();

        if (bitmap != null) {

            canvas.save();

            camera.save();
            camera.rotateX(rotateX);
            camera.rotateY(rotateY);
            camera.rotateZ(rotateZ);
            canvas.translate(128 + 150, 128 + 150);
            camera.applyToCanvas(canvas);
            canvas.translate(-(128 + 150), -(128 + 150));
            camera.restore();

            canvas.drawBitmap(bitmap, 150, 150, paint);
            canvas.restore();
        } else {
            paint.setTextSize(36);
            paint.setAntiAlias(true);
            canvas.drawText("Not have Bitmap", 72, 8, paint);
        }
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setRotateX(float rotateX) {
        this.rotateX = rotateX;
    }

    public void setRotateY(float rotateY) {
        this.rotateY = rotateY;
    }

    public void setRotateZ(float rotateZ) {
        this.rotateZ = rotateZ;
    }
}
