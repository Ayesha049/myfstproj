package com.example.l.myfstproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ifurActivity extends AppCompatActivity {

    TextView res;
    Button btn1,btn2;
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifur);

        res= (TextView) findViewById(R.id.lblR);

        btn1= (Button) findViewById(R.id.btnAdd);
        btn2= (Button) findViewById(R.id.btnSub);

        t1= (EditText) findViewById(R.id.txtNum1);
        t2= (EditText) findViewById(R.id.txtNum2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b;
                a= Integer.valueOf( t1.getText().toString());
                b= Integer.valueOf( t2.getText().toString());
                int c=a+b;
                res.setText(c);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b;
                a= Integer.valueOf( t1.getText().toString());
                b= Integer.valueOf( t2.getText().toString());
                int c=a-b;
                res.setText(c);

            }
        });
    }
}
