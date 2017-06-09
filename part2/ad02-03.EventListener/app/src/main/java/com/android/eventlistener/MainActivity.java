package com.android.eventlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 무명 클래스를 이용한 리스너 설정. 선언,찾기,설정
        Button btn1 = null;
        btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( getApplicationContext(), "무명 클래스 핸들러 방식", Toast.LENGTH_SHORT).show();
            }
        });

        // 3. 내부 클래스 핸들러 방식
        Button btn3 = null;
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener( new ButtonClick() );

        // 4. implement 핸들러 방식
        Button btn4 = null;
        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener( this );

    }

    // 2. 인라인 핸들러 방식
    public void button2Click(View view) {
        Toast.makeText( getApplicationContext(), "인라인 핸들러 방식", Toast.LENGTH_SHORT).show();
    }

    // 3. 내부 클래스 핸들러 방식
    class ButtonClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText( getApplicationContext(), "내부 클래스 핸들러 방식", Toast.LENGTH_SHORT).show();
        }
    }

    // 4. implement 핸들러 방식
    @Override
    public void onClick(View v) {
        Toast.makeText( getApplicationContext(), "implement 핸들러 방식", Toast.LENGTH_SHORT).show();
    }
}
