package org.example;

public class ScoreKeeper {
    private int scoreTeamA;
    private int scoreTeamB;

    public ScoreKeeper() {
        /* Refactoring */
        scoreTeamA = 0;
        scoreTeamB = 0;
    }

    /*
    public void scoreTeamA1() {
        scoreTeamA += 1;
    }

    public void scoreTeamA2() {
        scoreTeamA += 2;
    }

    public void scoreTeamA3() {
        scoreTeamA += 3;
    }

    public void scoreTeamB1() {
        scoreTeamB += 1;
    }

    public void scoreTeamB2() {
        scoreTeamB += 2;
    }

    public void scoreTeamB3() {
        scoreTeamB += 3;
    }*/
    /* 
    public void scoreTeamA(int points) {
        scoreTeamA += points;
    }

    public void scoreTeamB(int points) {
        scoreTeamB += points;
    }*/

    public String getScore() {
        return String.format("%03d:%03d", scoreTeamA, scoreTeamB);
    }
}

