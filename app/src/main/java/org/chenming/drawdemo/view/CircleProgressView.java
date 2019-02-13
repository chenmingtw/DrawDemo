package org.chenming.drawdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CircleProgressView extends View {

    private float progress = 0;
    private int circleColor = Color.GREEN;
    private int textColor = Color.BLACK;

    public CircleProgressView(Context context) {
        super(context);
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paintC = new Paint();
        paintC.setAntiAlias(true);
        paintC.setColor(circleColor);
        paintC.setStrokeCap(Paint.Cap.ROUND);
        paintC.setStyle(Paint.Style.STROKE);
        paintC.setStrokeWidth(36);

        String sProgress = progress + "%";
        Paint paintT = new Paint();
        paintT.setAntiAlias(true);
        paintT.setColor(textColor);
        paintT.setTextSize(20);

        canvas.drawArc(100, 100, 400, 400,  270, progress * 3.6f, false, paintC);
        canvas.drawText(sProgress, 0, sProgress.length(), 200, 250, paintT);
    }

    public int getCircleColor() {
        return circleColor;
    }

    public int getTextColor() {
        return textColor;
    }

    public float getProgress() {
        return progress;
    }

    public void setCircleColor(int circleColor) {
        this.circleColor = circleColor;
        invalidate();
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
        invalidate();
    }

    public void setProgress(float progress) {
        this.progress = progress;
        invalidate();
    }
}
