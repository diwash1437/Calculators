package com.example.calculators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);

        final TextView calculatorScrreen = findViewById(R.id.calculatorscreen);
        final Button n0= findViewById(R.id.n0);
        final Button n1= findViewById(R.id.n1);
        final Button n2= findViewById(R.id.n2);
        final Button n3= findViewById(R.id.n3);
        final Button n4= findViewById(R.id.n4);
        final Button n5= findViewById(R.id.n5);
        final Button n6= findViewById(R.id.n6);
        final Button n7= findViewById(R.id.n7);
        final Button n8= findViewById(R.id.n8);
        final Button n9= findViewById(R.id.n9);
        final Button dot= findViewById(R.id.dot);
        final Button equals= findViewById(R.id.equal);
        final Button addition= findViewById(R.id.addition);
        final Button subtraction= findViewById(R.id.subtraction);
        final Button multiplication= findViewById(R.id.multiplication);
        final Button division= findViewById(R.id.division);

        final View.OnClickListener calculatorlistener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        };




    }
}
