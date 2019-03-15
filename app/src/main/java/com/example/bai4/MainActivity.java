package com.example.bai4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =(Button)findViewById(R.id.showresult);
        result=(TextView) findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                RadioGroup group=(RadioGroup) findViewById(R.id.radioGroup1);
                int id=group.getCheckedRadioButtonId();
                String bang="";
                RadioButton rad=(RadioButton) findViewById(id);
                bang=rad.getText()+"";
                if(bang.equals("Background")){
                    result.setBackgroundColor(0x55FF0000);
                }
                if(bang.equals("Text Color")){
                    result.setTextColor(0x55FF0000);
                }
                if(bang.equals("Center")){
                    result.setGravity(Gravity.CENTER);
                }
                RadioGroup group1=(RadioGroup) findViewById(R.id.radioGroup2);
                int id1=group1.getCheckedRadioButtonId();
                String bang1="";
                RadioButton rad1=(RadioButton) findViewById(id1);
                bang1=rad1.getText()+"";
                Log.d("AAA",bang1);
                if(bang1.equals("Even")){
                    while(true){
                        int a= new Random().nextInt();
                        if(a%2==0){
                            result.setText(a+"");
                            break;
                        }
                    }

                }
                if(bang1.equals("Odd")){
                    while(true){
                        int a= new Random().nextInt();
                        if(a%2!=0){
                            result.setText(a+"");
                            break;
                        }
                    }
                }
                if(bang1.equals("Both")){
                    int a= new Random().nextInt();
                    result.setText(a+"");
                }
            }
        });

    }
}
