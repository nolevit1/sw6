/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
/*
    @Test
    public void testInitialScore() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        assertEquals("000:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA1() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA1();
        assertEquals("001:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA2() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA2();
        assertEquals("002:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA3() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA3();
        assertEquals("003:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB1() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB1();
        assertEquals("000:001", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB2() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB2();
        assertEquals("000:002", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB3() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB3();
        assertEquals("000:003", scoreKeeper.getScore());
    }

    @Test
    public void testCombinedScore() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA3();
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB3();
        assertEquals("006:006", scoreKeeper.getScore());
    }
*/
    /*Refactoring */

    @Test
    public void testInitialScore() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        assertEquals("000:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA1() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA(1);
        assertEquals("001:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA2() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA(2);
        assertEquals("002:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA3() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA(3);
        assertEquals("003:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB1() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB(1);
        assertEquals("000:001", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB2() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB(2);
        assertEquals("000:002", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB3() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB(3);
        assertEquals("000:003", scoreKeeper.getScore());
    }

    @Test
    public void testCombinedScore() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA(1);
        scoreKeeper.scoreTeamA(2);
        scoreKeeper.scoreTeamA(3);
        scoreKeeper.scoreTeamB(1);
        scoreKeeper.scoreTeamB(2);
        scoreKeeper.scoreTeamB(3);
        assertEquals("006:006", scoreKeeper.getScore());
    }
}
