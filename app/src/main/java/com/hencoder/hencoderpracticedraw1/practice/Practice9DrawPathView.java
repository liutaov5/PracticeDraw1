package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private Paint paint = new Paint();
    private int width;
    private int height;
    private Path path = new Path();
    private RectF rectF = new RectF();

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        width = getWidth();
        height = getHeight();

//        path.moveTo(width / 2 - 100f, height / 2 - 20f);
        rectF.set(width / 2 - 100f, height / 2 - 100f, width / 2, height / 2);
        //arcTo会和之前moveTo的坐标连起来，addArc则不会
        path.arcTo(rectF, -225, 225);
        rectF.set(width / 2, height / 2 - 100f, width / 2 + 100f, height / 2);
        path.arcTo(rectF, -180, 225, false);
        path.lineTo(width / 2, height / 2 + 100f);
        path.close();

        canvas.drawPath(path, paint);
    }
}
