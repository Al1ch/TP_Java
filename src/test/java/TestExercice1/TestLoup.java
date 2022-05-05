package TestExercice1;

import Exercice1.LoupGarou;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestLoup {
    LoupGarou loup = new LoupGarou();

    @BeforeEach
    public void setUpLoup(){

        loup.setPosition("North");
    }

    @Test
    public void verifyStartNorth(){
        Assertions.assertEquals("North", loup.getPosition());
    }

    @Test
    public void verifyTurnNorth(){
        Assertions.assertEquals("East", loup.turningposition("North"));
    }

    @Test
    public void verifyTurnEast(){
        Assertions.assertEquals("South", loup.turningposition("East"));
    }

    @Test
    public void verifyTurnSouth(){
        Assertions.assertEquals("West", loup.turningposition("South"));
    }

    @Test
    public void verifyTurnWest(){
        Assertions.assertEquals("North", loup.turningposition("West"));
    }


}
