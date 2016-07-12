package com.example.vaclav.score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneA(View view) {
        updateScore('A', 1);
    }
    public void addTwoA(View view) {
        updateScore('A', 2);
    }
    public void addThreeA(View view) {
        updateScore('A', 3);
    }

    public void addOneB(View view) {
        updateScore('B', 1);
    }
    public void addTwoB(View view) {
        updateScore('B', 2);
    }
    public void addThreeB(View view) {
        updateScore('B', 3);
    }

    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        updateUiForTeamA();
        updateUiForTeamB();
    }

    public void updateScore(char team, int by) {
        if (team == 'A') {
          scoreA += by;
          updateUiForTeamA();
        }    else {
          scoreB += by;
          updateUiForTeamB();
        }
    }

    public void updateUiForTeamA() {
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        teamAScore.setText(""+scoreA);
    }

    public void updateUiForTeamB() {
        TextView teamAScore = (TextView) findViewById(R.id.teamBScore);
        teamAScore.setText(String.valueOf(scoreB));
    }
}
