package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint paint = new Paint();
    private int width;
    private int height;
    private RectF rectF = new RectF();

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        width = getWidth();
        height = getHeight();
        rectF.set(200f, 200f, width - 200f, height - 200f);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(rectF, 260f, 80f, true, paint);
        canvas.drawArc(rectF, 20f, 140f, false, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF, 190f, 60f, false, paint);



    }
}
