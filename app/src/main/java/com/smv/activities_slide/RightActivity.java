package com.smv.activities_slide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class RightActivity extends AppCompatActivity
{
    //y ne rabimo, seveda pa obstaja
    float x1, x2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right);

        setTitle("Right Activity");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        //return super.onTouchEvent(event);

        //x1 in x2 sta definirana v razredu, če sta lokalni spremenljivki, ne dela ok
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                Intent intent;
                if(x1 < x2)
                {
                    intent = new Intent(RightActivity.this, MainActivity.class);
                    startActivity(intent);
                }
        }
        return true;
    }
}
