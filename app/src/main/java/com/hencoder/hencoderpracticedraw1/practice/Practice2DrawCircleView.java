package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private Paint paint = new Paint();
    private Context mContext;

    public Practice2DrawCircleView(Context context) {
        super(context);
        mContext = context;
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);

        int width = getWidth();
        int height = getHeight();

        canvas.drawCircle(width / 4, height / 4, width / 7, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(ScreenUtils.dip2px(mContext, 1));
        canvas.drawCircle(width * 3 / 4, height / 4, width / 7, paint);

        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(width / 4, height * 3 / 4, width / 7, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(ScreenUtils.dip2px(mContext, 20));
        paint.setColor(Color.BLACK);
        canvas.drawCircle(width * 3 / 4, height * 3 / 4, width / 7, paint);
    }
}
