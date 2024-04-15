package com.example.chapter11;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.TextView;

@SuppressLint("DefaultLocale")
public class TouchMultipleActivity extends AppCompatActivity {
    private TextView tv_touch_major; // 声明一个文本视图对象
    private TextView tv_touch_minor; // 声明一个文本视图对象
    private boolean isMinorDown = false; // 次要点是否按下

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_multiple);
        tv_touch_major = findViewById(R.id.tv_touch_major);
        tv_touch_minor = findViewById(R.id.tv_touch_minor);
    }

    // 在发生触摸事件时触发
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // 从开机到现在的毫秒数
        int seconds = (int) (event.getEventTime() / 1000);
        String desc_major = String.format("主要动作发生时间：开机距离现在%02d:%02d:%02d\n%s",
                seconds / 3600, seconds % 3600 / 60, seconds % 60, "主要动作名称是：");
        String desc_minor = "";
        isMinorDown = (event.getPointerCount() >= 2);
        // 获得包括次要点在内的触摸行为
        int action = event.getAction() & MotionEvent.ACTION_MASK;
        if (action == MotionEvent.ACTION_DOWN) { // 按下手指
            desc_major = String.format("%s按下", desc_major);
        } else if (action == MotionEvent.ACTION_MOVE) { // 移动手指
            desc_major = String.format("%s移动", desc_major);
            if (isMinorDown) {
                desc_minor = String.format("%s次要动作名称是：移动", desc_minor);
            }
        } else if (action == MotionEvent.ACTION_UP) { // 提起手指
            desc_major = String.format("%s提起", desc_major);
        } else if (action == MotionEvent.ACTION_CANCEL) { // 取消手势
            desc_major = String.format("%s取消", desc_major);
        } else if (action == MotionEvent.ACTION_POINTER_DOWN) { // 次要点按下
            desc_minor = String.format("%s次要动作名称是：按下", desc_minor);
        } else if (action == MotionEvent.ACTION_POINTER_UP) { // 次要点松开
            desc_minor = String.format("%s次要动作名称是：提起", desc_minor);
        }
        desc_major = String.format("%s\n主要动作发生位置是：横坐标%f，纵坐标%f",
                desc_major, event.getX(), event.getY());
        tv_touch_major.setText(desc_major);
        if (isMinorDown || !TextUtils.isEmpty(desc_minor)) { // 存在次要点触摸
            desc_minor = String.format("%s\n次要动作发生位置是：横坐标%f，纵坐标%f",
                    desc_minor, event.getX(1), event.getY(1));
            tv_touch_minor.setText(desc_minor);
        }
        return super.onTouchEvent(event);
    }

}
