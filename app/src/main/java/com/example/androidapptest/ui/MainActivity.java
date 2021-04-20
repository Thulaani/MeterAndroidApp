package com.example.androidapptest.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.androidapptest.R;

public class MainActivity extends AppCompatActivity {
TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.textV);
        //Calling the calcAmount function
        calcAmount(22,55);
    }
    //declaring a function that will do the calculations
    void calcAmount(double amountEntered, double costAmount){
        double changeAmount ;
             if(amountEntered >= costAmount){
                 changeAmount = amountEntered - costAmount;
                 myTextView.setText("Please take your change = R"+ changeAmount + "\n"+ "Thank you!!"+"\nTravel safe!!");
            }else{
                 changeAmount = amountEntered - costAmount;
                 myTextView.setText("You still owe  R" + Math.abs(changeAmount)+ " \nplease pay now!!");
             }
    }
}