/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.example;

public class App {
    public static void main(String[] args) {
        ScoreKeeper scoreKeeper = new ScoreKeeper();

        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA3();
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB3();

        System.out.println(scoreKeeper.getScore());
    }
}