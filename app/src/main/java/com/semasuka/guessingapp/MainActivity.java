package com.semasuka.guessingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int ranNum;


    public void checkGuess(View view) {

         Log.i("clicking", String.valueOf(ranNum));




        EditText guessNum = (EditText) findViewById(R.id.guess);

        int inNum = Integer.parseInt(guessNum.getText().toString());

        String message="";


        if (ranNum < inNum) {
            message="your number is greater that the one generated";

        } else if (ranNum > inNum) {

            message="your number is smaller that the one generated";
        } else {
            message= "EREKAAA!!You are right";
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random ran = new Random();

        ranNum = ran.nextInt(21);
    }
}
