package com.barryyang.barryyangdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.barryyang.barryyangdemo.activity.TestActivity;
import com.barryyang.barryyangdemo.service.TargetServiceActivity;

/**
 * 测试各种
 *
 * @author barryyang
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Activity生命周期测试
     *
     * @param view
     */
    public void jumpActivity(View view) {
        startActivity(new Intent(this, TestActivity.class));
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent: ");
    }

    /**
     * Service生命周期测试
     *
     * @param view
     */
    public void jumpService(View view) {
        startActivity(new Intent(this, TargetServiceActivity.class));
    }
}