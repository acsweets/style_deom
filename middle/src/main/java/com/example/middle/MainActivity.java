package com.example.middle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by ouyangshen on 2017/9/24.
 */
public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_relative_xml).setOnClickListener(this);
        findViewById(R.id.btn_relative_code).setOnClickListener(this);
        findViewById(R.id.btn_frame).setOnClickListener(this);
        findViewById(R.id.btn_checkbox).setOnClickListener(this);
        findViewById(R.id.btn_switch_default).setOnClickListener(this);
        findViewById(R.id.btn_switch_ios).setOnClickListener(this);
        findViewById(R.id.btn_radio_horizontal).setOnClickListener(this);
        findViewById(R.id.btn_radio_vertical).setOnClickListener(this);
        findViewById(R.id.btn_spinner_dropdown).setOnClickListener(this);
        findViewById(R.id.btn_spinner_dialog).setOnClickListener(this);
        findViewById(R.id.btn_spinner_icon).setOnClickListener(this);
        findViewById(R.id.btn_edit_simple).setOnClickListener(this);
        findViewById(R.id.btn_edit_cursor).setOnClickListener(this);
        findViewById(R.id.btn_edit_border).setOnClickListener(this);
        findViewById(R.id.btn_edit_hide).setOnClickListener(this);
        findViewById(R.id.btn_edit_jump).setOnClickListener(this);
        findViewById(R.id.btn_edit_auto).setOnClickListener(this);
        findViewById(R.id.btn_act_jump).setOnClickListener(this);
        findViewById(R.id.btn_act_rotate).setOnClickListener(this);
        findViewById(R.id.btn_act_home).setOnClickListener(this);
        findViewById(R.id.btn_act_uri).setOnClickListener(this);
        findViewById(R.id.btn_act_request).setOnClickListener(this);
        findViewById(R.id.btn_text_check).setOnClickListener(this);
        findViewById(R.id.btn_mortgage).setOnClickListener(this);
        findViewById(R.id.btn_alert).setOnClickListener(this);
        findViewById(R.id.btn_login).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_relative_xml) {
            //定义相对布局
            Intent intent = new Intent(this, RelativeXmlActivity.class);
            startActivity(intent);
            //代码定义相对布局
        } else if (v.getId() == R.id.btn_relative_code) {
            Intent intent = new Intent(this, RelativeCodeActivity.class);
            startActivity(intent);
            //框架布局
        } else if (v.getId() == R.id.btn_frame) {
            Intent intent = new Intent(this, FrameActivity.class);
            startActivity(intent);
            //复选框
        } else if (v.getId() == R.id.btn_checkbox) {
            Intent intent = new Intent(this, CheckboxActivity.class);
            startActivity(intent);
            //开关按钮
        } else if (v.getId() == R.id.btn_switch_default) {
            Intent intent = new Intent(this, SwitchDefaultActivity.class);
            startActivity(intent);
            //仿ios按钮
        } else if (v.getId() == R.id.btn_switch_ios) {
            Intent intent = new Intent(this, SwitchIOSActivity.class);
            startActivity(intent);
            //水平单选按钮

        } else if (v.getId() == R.id.btn_radio_horizontal) {
            Intent intent = new Intent(this, RadioHorizontalActivity.class);
            startActivity(intent);
            // 垂直自定义单选
        } else if (v.getId() == R.id.btn_radio_vertical) {
            Intent intent = new Intent(this, RadioVerticalActivity.class);
            startActivity(intent);
            // 下拉列表
        } else if (v.getId() == R.id.btn_spinner_dropdown) {
            Intent intent = new Intent(this, SpinnerDropdownActivity.class);
            startActivity(intent);
            //对话框列表
        } else if (v.getId() == R.id.btn_spinner_dialog) {
            Intent intent = new Intent(this, SpinnerDialogActivity.class);
            startActivity(intent);
            // 带图标列表
        } else if (v.getId() == R.id.btn_spinner_icon) {
            Intent intent = new Intent(this, SpinnerIconActivity.class);
            startActivity(intent);
            // 简单编辑框
        } else if (v.getId() == R.id.btn_edit_simple) {
            Intent intent = new Intent(this, EditSimpleActivity.class);
            startActivity(intent);
            // 更换编辑光标
        } else if (v.getId() == R.id.btn_edit_cursor) {
            Intent intent = new Intent(this, EditCursorActivity.class);
            startActivity(intent);
            // 更换编辑框
        } else if (v.getId() == R.id.btn_edit_border) {
            Intent intent = new Intent(this, EditBorderActivity.class);
            startActivity(intent);
            //  影藏输入法
        } else if (v.getId() == R.id.btn_edit_hide) {
            Intent intent = new Intent(this, EditHideActivity.class);
            startActivity(intent);
            //  回车自动跳转
        } else if (v.getId() == R.id.btn_edit_jump) {
            Intent intent = new Intent(this, EditJumpActivity.class);
            startActivity(intent);
            //  自动完成编辑
        } else if (v.getId() == R.id.btn_edit_auto) {
            Intent intent = new Intent(this, EditAutoActivity.class);
            startActivity(intent);
            //  跳转与返回
        } else if (v.getId() == R.id.btn_act_jump) {
            Intent intent = new Intent(this, ActJumpActivity.class);
            startActivity(intent);
            //  横屏竖屏切换
        } else if (v.getId() == R.id.btn_act_rotate) {
            Intent intent = new Intent(this, ActRotateActivity.class);
            startActivity(intent);
            //  按下home建
        } else if (v.getId() == R.id.btn_act_home) {
            Intent intent = new Intent(this, ActHomeActivity.class);
            startActivity(intent);
            // 跳转到url
        } else if (v.getId() == R.id.btn_act_uri) {
            Intent intent = new Intent(this, ActUriActivity.class);
            startActivity(intent);
            //  请求参数和应答参数
        } else if (v.getId() == R.id.btn_act_request) {
            Intent intent = new Intent(this, ActRequestActivity.class);
            startActivity(intent);
            //  文本效验
        } else if (v.getId() == R.id.btn_text_check) {
            Intent intent = new Intent(this, TextCheckActivity.class);
            startActivity(intent);
            //房贷计算器
        } else if (v.getId() == R.id.btn_mortgage) {
            Intent intent = new Intent(this, MortgageActivity.class);
            startActivity(intent);
            //  提醒对话框
        } else if (v.getId() == R.id.btn_alert) {
            Intent intent = new Intent(this, AlertActivity.class);
            startActivity(intent);
            //  app登录界面
        } else if (v.getId() == R.id.btn_login) {
            Intent intent = new Intent(this, LoginMainActivity.class);
            startActivity(intent);
        }
    }

}
