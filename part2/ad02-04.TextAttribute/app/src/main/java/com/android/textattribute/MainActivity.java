package com.android.textattribute;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 1. 위젯 선언
    TextView txt1=null,txt2=null,txt3=null,txt4=null,txt5=null,txt6=null,txt7=null,txt8=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 2.위젯 찾기
        txt1 = (TextView)findViewById(R.id.txt1);
        txt2 = (TextView)findViewById(R.id.txt2);
        txt3 = (TextView)findViewById(R.id.txt3);
        txt4 = (TextView)findViewById(R.id.txt4);
        txt5 = (TextView)findViewById(R.id.txt5);
        txt6 = (TextView)findViewById(R.id.txt6);
        txt7 = (TextView)findViewById(R.id.txt7);
        txt8 = (TextView)findViewById(R.id.txt8);

        // 3. 위젯 핸들러 설정
        Button btn1 = null;
        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTitle("텍스트 속성 변경 후");

                txt1.setTextSize(20);
                txt2.setTextColor(Color.BLUE);
                txt3.setTypeface(txt3.getTypeface(), Typeface.BOLD|Typeface.ITALIC|Typeface.NORMAL);
                txt4.setTypeface(Typeface.SERIF );
                txt5.setSingleLine();

                txt6.setText("안녕하세요?");
                txt6.setTextColor(Color.RED);

                txt7.setTextSize(30);
                txt7.setTypeface(Typeface.SERIF, Typeface.BOLD_ITALIC);

                txt8.setSingleLine();
                txt8.setText("가나다라마바사아자카타하가나다라마바사아자카타하가나다라마바사아자카타하가나다라마바사아자카타하");
            }
        });

    }

}
