package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint paint = new Paint();
    private int width;
    private int height;
    private int rectWidth;
    private int margin = 100;
    private int padding = 20;
    private RectF rectF = new RectF();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);

        width = getWidth();
        height = getHeight();
        rectWidth = (width - 2 * margin - 8 * padding) / 7;
        //y轴
        canvas.drawLine(margin, margin, margin, height - margin, paint);
        //x轴
        canvas.drawLine(margin, height - margin, width - margin, height - margin, paint);

        paint.setColor(Color.GREEN);
        rectF.set(margin + padding, margin + (height - margin * 2) * 0.95f, margin + padding + rectWidth, height - margin);
        canvas.drawRect(rectF, paint);
        rectF.set(margin + rectWidth + 2 * padding, margin + (height - margin * 2) * 0.9f, margin + 2 * padding + 2 * rectWidth, height - margin);
        canvas.drawRect(rectF, paint);
        rectF.set(margin + 2 * rectWidth + 3 * padding, margin + (height - margin * 2) * 0.55f, margin + 3 * padding + 3 * rectWidth, height - margin);
        canvas.drawRect(rectF, paint);
        rectF.set(margin + 3 * rectWidth + 4 * padding, margin + (height - margin * 2) * 0.3f, margin + 4 * padding + 4 * rectWidth, height - margin);
        canvas.drawRect(rectF, paint);
        rectF.set(margin + 4 * rectWidth + 5 * padding, margin + (height - margin * 2) * 0.2f, margin + 5 * padding + 5 * rectWidth, height - margin);
        canvas.drawRect(rectF, paint);
        rectF.set(margin + 5 * rectWidth + 6 * padding, margin + (height - margin * 2) * 0.6f, margin + 6 * padding + 6 * rectWidth, height - margin);
        canvas.drawRect(rectF, paint);
        rectF.set(margin + 6 * rectWidth + 7 * padding, margin + (height - margin * 2) * 0.8f, margin + 7 * padding + 7 * rectWidth, height - margin);
        canvas.drawRect(rectF, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(14);
        canvas.drawText("Froyo", margin + padding, height - margin + 20, paint);
        canvas.drawText("GB", margin + rectWidth + 2 * padding, height - margin + 20, paint);
        canvas.drawText("ICS", margin + 2 * rectWidth + 3 * padding, height - margin + 20, paint);
        canvas.drawText("JB", margin + 3 * rectWidth + 4 * padding, height - margin + 20, paint);
        canvas.drawText("KitKat", margin + 4 * rectWidth + 5 * padding, height - margin + 20, paint);
        canvas.drawText("L", margin + 5 * rectWidth + 6 * padding, height - margin + 20, paint);
        canvas.drawText("M", margin + 6 * rectWidth + 7 * padding, height - margin + 20, paint);
    }
}
