package TestExercice1;

import Exercice1.LoupGarou;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestLoup {
    LoupGarou loup = new LoupGarou("North");


    @BeforeEach
    public void setUpLoup(){
        loup.turningposition();
    }

    @Test
    public void verifyStartNorth(){
        Assertions.assertEquals("North", loup.getPosition());
    }

    @Test
    public void verifyTurnNorth(){
        Assertions.assertEquals("East", loup.turningposition());
    }

    @Test
    public void verifyTurnEast(){
        Assertions.assertEquals("South", loup.turningposition());
    }

    @Test
    public void verifyTurnSouth(){
        Assertions.assertEquals("West", loup.turningposition());
    }

    @Test
    public void verifyTurnWest(){
        Assertions.assertEquals("North", loup.turningposition());
    }


}
