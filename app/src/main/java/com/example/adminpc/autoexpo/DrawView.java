package com.example.adminpc.autoexpo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

public class DrawView extends View {
    Paint paint = new Paint();

    public DrawView(Context context) {
        super(context);
        paint.setColor(Color.BLACK);
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawLine(0, 0, 20, 20, paint);
        canvas.drawLine(20, 20, 100, 20, paint);
        canvas.drawLine(100, 20, 500, 100, paint);

        Log.v("juj","h");
    }

}