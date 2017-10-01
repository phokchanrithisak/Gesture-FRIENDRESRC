package com.example.somto.swipe;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener
        {
            TextView tv=null;
            GestureDetectorCompat compat=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.text);
        compat = new GestureDetectorCompat(this,this);
    }

            @Override
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                tv.setText("Single Tap");
                return false;
            }

            @Override
            public boolean onDoubleTap(MotionEvent motionEvent) {
                tv.setText("Double Tap");
                return false;
            }

            @Override
            public boolean onDoubleTapEvent(MotionEvent motionEvent) {

                return false;
            }


            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {

                this.compat.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            }

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                tv.setText("Down");

                return false;
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
                tv.setText("Show Press");
                return;

            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                tv.setText("Single Tap");
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                tv.setText("Scroll");
                return false;
            }

            @Override
            public void onLongPress(MotionEvent motionEvent) {
                tv.setText("Long Press");
                this.compat.isLongpressEnabled();
                return;

            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                tv.setText("Fling");
                return false;
            }
        }
