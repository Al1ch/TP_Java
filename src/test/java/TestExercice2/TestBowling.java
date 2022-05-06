package TestExercice2;
import Exercice2.Joueur;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBowling {


    @Test
    public void TestNbredeQuilleTwoTry(){
        Joueur j1 = new Joueur();
        j1.setLancer(3,7);
        Assertions.assertEquals(10, j1.checkNbreTry());
    }

    @Test
    public void TestNbredeQuilleOneTry(){
        Joueur j1 = new Joueur();
        j1.setLancer(3,7);
        Assertions.assertEquals(10, j1.checkNbreTry());
    }

    /*
    @Test
    public void TestScoreReserve(){

    }

    @Test
    public void TestScoreReserve(){

    }

    @Test
    public void TestDernierCadre(){

    }

    @Test
    public void ScoreTotal(){

    }
    */

}
