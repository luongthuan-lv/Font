package vn.edu.poly.lab2;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;

public class BlazedFont extends AppCompatTextView {

    public BlazedFont(Context context) {
        super(context);
        setFont(context);
    }

    public BlazedFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont(context);
    }

    public BlazedFont(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont(context);
    }

    public void setFont(Context context){
        Typeface typeface=Typeface.createFromAsset(context.getAssets(),"fonts/Blazed.ttf");
        setTypeface(typeface);
    }
}
