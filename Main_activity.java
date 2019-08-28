package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final int POINTS_FOR_FREE_THROW = 3;
    final int POINTS_FOR_TWO_THROW = 2;
    final int POINTS_FOR_ONE_THROW = 1;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(int score, String team) {
        TextView scoreView;
        if (team.equals("a")) {
            scoreView = findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(score));
        } else if (team.equals("b")) {
            scoreView = findViewById(R.id.team_b_score);
            scoreView.setText(String.valueOf(score));
        }
    }

    public void addScore(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.pointsPlusA3_text_view:
                scoreTeamA += POINTS_FOR_FREE_THROW;
                display(scoreTeamA, "a");
                break;
            case R.id.pointsPlusB3_text_view:
                scoreTeamB += POINTS_FOR_FREE_THROW;
                display(scoreTeamB, "b");
                break;
            case R.id.pointsPlusA2_text_view:
                scoreTeamA += POINTS_FOR_TWO_THROW;
                display(scoreTeamA, "a");
                break;
            case R.id.pointsPlusB2_text_view:
                scoreTeamB += POINTS_FOR_TWO_THROW;
                display(scoreTeamB, "b");
                break;
            case R.id.pointsPlusA1_text_view:
                scoreTeamA += POINTS_FOR_ONE_THROW;
                display(scoreTeamA, "a");
                break;
            case R.id.pointsPlusB1_text_view:
                scoreTeamB += POINTS_FOR_ONE_THROW;
                display(scoreTeamB, "b");
                break;
        }
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        display(scoreTeamA, "a");
        display(scoreTeamB, "b");
    }
}
