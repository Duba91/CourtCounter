package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    int redcard_a=0;
    int yellowcard_a=0;
    int redcard_b=0;
    int yellowcard_b=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayYellowA(yellowcard_a);
        displayRedA(redcard_a);
        displayYellowA(yellowcard_b);
        displayRedA(redcard_b);

    }
    public void resetScore(View v){


    scoreTeamA=0;
    scoreTeamB=0;
        yellowcard_a=0;
        redcard_a=0;
        redcard_b=0;
        yellowcard_b=0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayYellowA(yellowcard_a);
        displayRedA(redcard_a);
        displayYellowB(yellowcard_b);
        displayRedB(redcard_b);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayYellowA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_a_card);
        scoreView.setText(String.valueOf(score));
    }
    public void displayRedA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_a_card);
        scoreView.setText(String.valueOf(score));
    }
    public void displayYellowB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_b_card);
        scoreView.setText(String.valueOf(score));
    }
    public void displayRedB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_b_card);
        scoreView.setText(String.valueOf(score));
    }
    public void addOneForTeamA(View v){
        scoreTeamA=scoreTeamA+1;

        displayForTeamA(scoreTeamA);


    }
    public void addOneForTeamB(View v){
        scoreTeamB=scoreTeamB+1;

        displayForTeamB(scoreTeamB);


    }

    public void addyellowA(View v){
        yellowcard_a=yellowcard_a+1;

        displayYellowA(yellowcard_a);


    }
    public void addredA(View v){
        redcard_a=redcard_a+1;

        displayRedA(redcard_a);


    }
    public void addyellowB(View v){
        yellowcard_b=yellowcard_b+1;

        displayYellowB(yellowcard_b);


    }
    public void addredB(View v){
        redcard_b=redcard_b+1;

        displayRedB(redcard_b);


    }


}
