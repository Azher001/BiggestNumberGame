package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView start;
    TextView Left;
    TextView Right;
    int left;
    int right;
    int leftVal;
    int rightVal;
    int score=0;
    TextView count;
    Button st;
    Random rand=new Random();
    int cnt=-1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start= (TextView) findViewById(R.id.start);
        Left=(TextView) findViewById(R.id.Left);
        Right=(TextView) findViewById(R.id.Right);
       // st=(Button) findViewById(R.id.start);
        count=(TextView) findViewById(R.id.count);
    }

    public void clickStart(View view) {
        if(cnt==-1) {

            left = rand.nextInt(500);
            right = rand.nextInt(500);
            leftVal = left - right;
            rightVal = right - left;
            Left.setText(left + "");
            Right.setText(right + "");
            start.setText("Score " + score + "");
            cnt++;
            count.setText("Count "+cnt + "");

        }
        else {
        }
        }



    public void LeftClicked(View view) {
        if(cnt>=0) {
            if (leftVal >= 0) {
                score++;
            } else {
                score--;
            }
            left = rand.nextInt(500);
            right = rand.nextInt(500);
            leftVal = left - right;
            rightVal = right - left;
            Left.setText(left + "");
            Right.setText(right + "");
            start.setText("Score " + score + "");
            cnt++;
            count.setText("Count "+cnt + "");

            if (cnt >= 10) {
                Toast.makeText(this, "The game is over. \n Your total score is " + score, Toast.LENGTH_LONG).show();

                recreate();
            }
        }

    }

    public void RightClicked(View view) {
        if(cnt>=0) {
            if (rightVal >= 0) {
                score++;
            } else {
                score--;
            }
            left = rand.nextInt(500);
            right = rand.nextInt(500);
            leftVal = left - right;
            rightVal = right - left;
            Left.setText(left + "");
            Right.setText(right + "");
            start.setText("Score " + score + "");
            cnt++;
            count.setText("Count "+cnt + "");


            if (cnt >= 10) {
                Toast.makeText(this, "The game is over. \n Your total score is " + score, Toast.LENGTH_LONG).show();

                recreate();
            }
        }

    }

   public void countClicked(View view){

   }

    public void Restart(View view) {
        recreate();
    }
}