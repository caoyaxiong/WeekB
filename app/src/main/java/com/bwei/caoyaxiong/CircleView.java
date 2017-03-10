package com.bwei.caoyaxiong;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * 1. 类的用途
 * 2. @author dell
 * 3. @date 2017/3/9 19:28
 */

public class CircleView extends View {
    private Paint paint=new Paint();
    
    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(getWidth()/2,getHeight()/2,160,paint);
        paint.setColor(Color.RED);
        canvas.drawCircle(getWidth()/2,getHeight()/2,120,paint);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(getWidth()/2,getHeight()/2,80,paint);
    }
}
