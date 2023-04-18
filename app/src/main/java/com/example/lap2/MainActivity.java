package com.example.lap2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textname, textsalary, kq, kq1;
    Button button;
    double tt, tt1, a;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textname = (TextView) findViewById(R.id.textname);
        textsalary = (TextView) findViewById(R.id.textsalary);
        button = (Button) findViewById(R.id.button);
        kq = (TextView) findViewById(R.id.kq);
        kq1 = (TextView) findViewById(R.id.kq1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strname = textname.getText().toString();
                Double salary = Double.parseDouble(textsalary.getText().toString());
                tt = Math.round(salary - (salary*10.5/100));
                if (tt < 11000000) {
                    kq1.setText(String.valueOf(tt));
                }
                else {
                    a = ((tt - 11000000) * 5/100);
                    tt1 = tt - a;
                    kq1.setText(String.valueOf(tt1));
                }
                kq.setText(strname);

            }
        });
    }
}