package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint paint = new Paint();
    private int width;
    private int height;
    private RectF rectF = new RectF();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        paint.setAntiAlias(true);
        width = getWidth();
        height = getHeight();
        rectF.set(100f, 50f, height - 50, height - 100f);
        paint.setColor(Color.parseColor("#FFC107"));
        canvas.drawArc(rectF, -60f, 60f, true, paint);
        paint.setColor(Color.parseColor("#9C27B0"));
        canvas.drawArc(rectF, 10f, 10f, true, paint);
        paint.setColor(Color.parseColor("#9E9E9E"));
        canvas.drawArc(rectF, 25f, 20f, true, paint);
        paint.setColor(Color.parseColor("#009688"));
        canvas.drawArc(rectF, 50f, 50f, true, paint);
        paint.setColor(Color.parseColor("#2196F3"));
        canvas.drawArc(rectF, 110f, 60f, true, paint);

        rectF.set(100f - 10f, 50f - 10f, height - 50 - 10f, height - 100f - 10f);
        paint.setColor(Color.parseColor("#F44336"));
        canvas.drawArc(rectF, 185f, 100f, true, paint);
    }
}
