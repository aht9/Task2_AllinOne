package com.amirht97.drawerview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class ButtonViewVazir extends AppCompatButton {
    public ButtonViewVazir(@NonNull Context context) {
        super(context);
    }

    public ButtonViewVazir(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"vazir.ttf");
        this.setTypeface(typeface);
    }
}
