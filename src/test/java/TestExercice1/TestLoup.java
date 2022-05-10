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
        loup.turningposition();
    }

    @Test
    public void verifyStartNorth(){
        loup.setLoupGarou("North");
        Assertions.assertEquals("North", loup.getPosition());
    }

    @Test
    public void verifyTurnNorth(){
        loup.setLoupGarou("North");
        Assertions.assertEquals("East", loup.turningposition());
    }

    @Test
    public void verifyTurnEast(){
        System.out.println(loup.getPosition());
        loup.setLoupGarou("East");
        Assertions.assertEquals("South", loup.turningposition());
    }

    @Test
    public void verifyTurnSouth(){
        loup.setLoupGarou("South");
        Assertions.assertEquals("West", loup.turningposition());
    }

    @Test
    public void verifyTurnWest(){
        loup.setLoupGarou("West");
        Assertions.assertEquals("North", loup.turningposition());
    }

    @Test
    public void verifyLoupRotation(){
        loup.setLoupGarou("North");
        Assertions.assertEquals("North", loup.LoupRotation(4));
    }
}
