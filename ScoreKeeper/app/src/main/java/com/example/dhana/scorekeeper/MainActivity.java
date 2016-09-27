package com.example.dhana.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;
    int teamAWicket = 0;
    int teamBWicket = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void teamAIncre1(View view){
        teamAScore += 1;
        displayScoreForTeamA(teamAScore);
    }
    public void teamAIncre2(View view){
        teamAScore += 2;
        displayScoreForTeamA(teamAScore);
    }
    public void teamAIncre3(View view){
        teamAScore += 3;
        displayScoreForTeamA(teamAScore);
    }

    public void teamAIncre4(View view){
        teamAScore += 4;
        displayScoreForTeamA(teamAScore);
    }

    public void teamAIncre6(View view){
        teamAScore += 6;
        displayScoreForTeamA(teamAScore);
    }

    public void teamAOnePlayerOut(View view){
        teamAWicket += 1;
        displayWicketForTeamA(teamAWicket);
    }

    public void displayScoreForTeamA(int runScore){
        TextView scoreView = (TextView)findViewById(R.id.team_a_run_score);
        scoreView.setText(String.valueOf(runScore));
    }

    public void displayWicketForTeamA(int wicketScore){
        TextView scoreView = (TextView)findViewById(R.id.team_a_wicket_score);
        scoreView.setText(String.valueOf(wicketScore));
    }

    //start B Code here

    public void teamBIncre1(View view){
        teamBScore += 1;
        displayScoreForTeamB(teamBScore);
    }
    public void teamBIncre2(View view){
        teamBScore += 2;
        displayScoreForTeamB(teamBScore);
    }
    public void teamBIncre3(View view){
        teamBScore += 3;
        displayScoreForTeamB(teamBScore);
    }

    public void teamBIncre4(View view){
        teamBScore += 4;
        displayScoreForTeamB(teamBScore);
    }

    public void teamBIncre6(View view){
        teamBScore += 6;
        displayScoreForTeamB(teamBScore);
    }

    public void teamBOnePlayerOut(View view){
        teamBWicket += 1;
        displayWicketForTeamB(teamBWicket);
    }

    public void displayScoreForTeamB(int runScore){
        TextView scoreView = (TextView)findViewById(R.id.team_b_run_score);
        scoreView.setText(String.valueOf(runScore));
    }

    public void displayWicketForTeamB(int wicketScore){
        TextView scoreView = (TextView)findViewById(R.id.team_b_wicket_score);
        scoreView.setText(String.valueOf(wicketScore));
    }

    public void resetScore(View view){
        teamAScore = 0;
        teamAWicket = 0;
        teamBScore = 0;
        teamBWicket = 0;
        displayScoreForTeamA(teamAScore);
        displayWicketForTeamA(teamAWicket);
        displayScoreForTeamB(teamBScore);
        displayWicketForTeamB(teamBWicket);
    }

}
