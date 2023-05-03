package com.example.starrailtoolbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //隐藏标题栏
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
        //创建子线程
        Thread mThread=new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    sleep(3000);//使程序休眠3秒
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        mThread.start();
    }
}
