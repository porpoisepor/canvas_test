package com.example.fonorio.canvastest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Rectangle extends View {
//    Canvas canvas_ = new Canvas(100,100, ARGB_8888);
    Rect rect = new Rect(0,0,0,0);
    Paint paint = new Paint();
    int height = 0;
    int width = 0;
    int leftSize = 300;
    int rightSize = 100;
    int topSize = 100;
    int bottomSize = 700;

    public Rectangle(Context context) {
        super(context);
        // at this point getWidth() and getHeight() return 0 so it doesn't work as intended
//        rect.set(getWidth()/2 - 50, getHeight()/2 - 50, getWidth()/2 + 200, getHeight()/2 + 50);
//        rect.set(100, 200, 300, 400);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(rect, paint);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        height = h;
        width = w;
        rect.set(width/2 - leftSize, height/2 - topSize, width/2 + rightSize, height/2 + bottomSize);
    }
}
