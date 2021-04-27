package com.milkywaylhy.ex29activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBtn(View view) {
        //Secondactivity라는 이름을 사용하지않고 Secondactivity를 실행시키기
        //묵시적 인텐트
        Intent intent= new Intent();
        //intent.setAction("aaa");
        intent.setAction("bbb");
        startActivity(intent);




    }
}