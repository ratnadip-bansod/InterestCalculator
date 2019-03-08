package com.example.interestcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // define the global variable

    // variable number1, number2 for input input number
    // Add_button, result textView

    EditText number1;
    EditText number2;
    EditText number3;
    Button simple_button;
    Button compound_button;
    TextView result;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // by ID we can use each component which id is assign in xml file
        number1=(EditText) findViewById(R.id.editText_first_no);
        number2=(EditText) findViewById(R.id.editText_second_no);
        number3=(EditText) findViewById(R.id.editText_third_no);
        simple_button=(Button) findViewById(R.id.simple_button);
        compound_button=(Button) findViewById(R.id.compound_button);
        result = (TextView) findViewById(R.id.textView_answer);


        simple_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double num3 = Double.parseDouble(number3.getText().toString());

                double simple_interest = (num1*num2*num3)/100;
                // set it ot result textview
                result.setText(Double.toString(simple_interest));
            }
        });

        compound_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double num3 = Double.parseDouble(number3.getText().toString());

                double compound_interest = (num1*Math.pow((1+num2), num3))-num1;
                // set it ot result textview
                result.setText(Double.toString(compound_interest));
            }
        });
    }
}
