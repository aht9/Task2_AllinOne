package com.amirht97.drawerview;


import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class TextViewVazir extends AppCompatTextView {

    public TextViewVazir(@NonNull Context context) {
        super(context);
    }

    public TextViewVazir(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"vazir.ttf");
        this.setTypeface(typeface);
    }
}
