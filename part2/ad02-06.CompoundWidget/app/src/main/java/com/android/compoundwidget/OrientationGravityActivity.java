package com.android.compoundwidget;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class OrientationGravityActivity extends AppCompatActivity {

    // 위젯 선언
    RadioGroup rgpDirection;
    RadioGroup rgpGravity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation_gravity);
                
        // 위젯 찾기,  Listener 설정 
        rgpDirection = (RadioGroup)findViewById(R.id.rgpDirection);
        rgpDirection.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                
                if(group == rgpDirection){
                    if(checkedId == R.id.rgpDirection_rdoHorizontal){
                        rgpDirection.setOrientation(LinearLayout.HORIZONTAL);
                    }
                    else{
                        rgpDirection.setOrientation(LinearLayout.VERTICAL);
                    }
                }
            }
        });
        
        
        // Listener 설정 방법 2. 내부 무명 클래스
        rgpGravity = (RadioGroup)findViewById(R.id.rgpGravity);
        rgpGravity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(group == rgpGravity){
                    if(checkedId == R.id.rgpGravity_rdoLeft){
                        rgpGravity.setGravity(Gravity.LEFT);
                    }
                    else if(checkedId == R.id.rgpGravity_rdoCenter){
                        rgpGravity.setGravity(Gravity.CENTER_HORIZONTAL);
                    }
                    else if(checkedId == R.id.rgpGravity_rdoRight){
                        rgpGravity.setGravity(Gravity.RIGHT);
                    }
                }
            }
        });
    }
}
