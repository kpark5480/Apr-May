package org.westada.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final TextView result = (TextView) findViewById(R.id.textView);

        Button add = (Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                result.setText(getNum1() + getNum2() + "");
            }
        });
        Button div = (Button) findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                result.setText(getNum1() / getNum2() + ""); // used wrong sign
            }
        });
        Button sub = (Button) findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                result.setText(getNum1() - getNum2() + "");
            }
        });
        Button mult = (Button) findViewById(R.id.mult);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                result.setText(getNum1() * getNum2() + "");
            }
        });
        Button sqrt = (Button) findViewById(R.id.sqrt);
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                result.setText(Math.sqrt(getNum1()) + "");

            }
        });
        Button sq = (Button) findViewById(R.id.sq);
        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                result.setText(Math.pow(getNum1(), 2.0) + "");

            }
        });


    }

    private double getNum1() {
        EditText number = (EditText) findViewById(R.id.numberEditText);
        return Double.parseDouble(number.getText().toString());
    }

    private double getNum2() {
        EditText number2 = (EditText) findViewById(R.id.secondnumberEditText);
        return Double.parseDouble(number2.getText().toString());
    }
}
