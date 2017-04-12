package com.example.android.onelifeonelove;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set title custom font
        TextView title1 = (TextView)findViewById(R.id.title1);
        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/glossandbloom.ttf");
        title1.setTypeface(customFont);
    }
}
