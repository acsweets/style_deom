package com.example.chapter02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 当前的页面布局采用的是res/layout/activity_main.xml
        setContentView(R.layout.activity_main);
        // 获取名叫tv_hello的TextView控件，注意添加导包语句import android.widget.TextView;
        TextView tv_hello = findViewById(R.id.tv_hello);
        // 设置TextView控件的文字内容
        tv_hello.setText("你好，世界");
    }

    @Override
    protected void onResume() {
        super.onResume();
        goNextPage(); // 跳到下个页面
    }

    // 跳到下个页面
    private void goNextPage() {
        TextView tv_hello = findViewById(R.id.tv_hello);
//        tv_hello.setText("3秒后进入下个页面");
//        // 延迟3秒（3000毫秒）后启动任务mGoNext
//        new Handler(Objects.requireNonNull(Looper.myLooper())).postDelayed(mGoNext, 3000);
    }

    //用于在单独的线程上启动 Main2Activity,这样可以避免阻塞主 UI 线程。当进行耗时操作(如网络请求或复杂计算)时,这种做法可以使应用程序保持响应式和高效。
    private Runnable mGoNext = new Runnable() {
        @Override
        public void run() {
            // 活动页面跳转，从MainActivity跳到Main2Activity
            startActivity(new Intent(MainActivity.this, Main2Activity.class));
        }
    };

}
