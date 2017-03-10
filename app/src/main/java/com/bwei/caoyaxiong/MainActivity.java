package com.bwei.caoyaxiong;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleView circleView= (CircleView) findViewById(R.id.circle);
        final TextView textView= (TextView) findViewById(R.id.text);
        circleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(Color.WHITE);
                textView.setText(getFixLenthString(4));
            }
        });
        
    }
    //生成指定位数的随机数
    private String getFixLenthString(int lenth){//返回长度为length的随机数，在前面补0
        Random random=new Random();
        //生成随机数
        double pross=(1+random.nextDouble())*Math.pow(10,lenth);
        //转化成字符串
        String num=String.valueOf(pross);
        //返回固定长度的随机数，lenth+1是因为下标从0开始
        return num.substring(1,lenth+1);
        
    }
}
