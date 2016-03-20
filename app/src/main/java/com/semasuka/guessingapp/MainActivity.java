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

    Random ran = new Random();


    public void checkGuess(View view) {
        //displaying the generated number in the log
         Log.i("clicking", String.valueOf(ranNum));



        //getting the value from the keyboard
        EditText guessNum = (EditText) findViewById(R.id.guess);

        int inNum = Integer.parseInt(guessNum.getText().toString());

        String message="";


        if (ranNum < inNum) {
            message="your number is greater that the one generated";

        } else if (ranNum > inNum) {

            message="your number is smaller that the one generated";
        } else {
            message= "EREKAAA!!You are right,now guess another number:-)";
            //after the right guess,we generate a new guess
            ranNum = ran.nextInt(21);
        }
        //displaying the specific toast
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //generating the random number at the creation of the layout
        ranNum = ran.nextInt(21);
    }
}
