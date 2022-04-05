package com.gupta.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ed1;
    private EditText ed2;
    private Button btn_sum;
    private TextView sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.ed_1) ;
        ed2 = findViewById(R.id.ed_2);
        btn_sum = findViewById(R.id.btn_add);
        sum = findViewById(R.id.tv_sum);

        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(ed1.getText().toString());
                int num2 = Integer.parseInt(ed2.getText().toString());

                int num = num1 + num2;

                sum.setText(String.valueOf(num));
            }
        });


    }
}
