package com.dane.dni.watch.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.widget.Button;

import com.dane.dni.common.views.CircularButton;

/**
 * Created by Dane on 12/22/2015.
 */
public class HolidayButton extends CircularButton {

    public HolidayButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTextScaleX(-1.0f);
        this.setText("\uE8E1");
        this.setTextAlignment(TEXT_ALIGNMENT_CENTER);
    }
}
