package TestExercice2;
import Exercice2.Joueur;
import Exercice2.Score;
import java.util.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TestBowling {
    Joueur j1 = new Joueur();

    @BeforeEach
    public void setUpJoueur(){
        j1.AllScore.add(j1.CreateNewScore(3,0));
        j1.AllScore.add(j1.CreateNewScore(5,3));
        j1.AllScore.add(j1.CreateNewScore(6,4));
        j1.AllScore.add(j1.CreateNewScore(8,1));
        j1.AllScore.add(j1.CreateNewScore(7,2));
        j1.AllScore.add(j1.CreateNewScore(8,0));
        j1.AllScore.add(j1.CreateNewScore(10,0));
        j1.AllScore.add(j1.CreateNewScore(3,4));
        j1.AllScore.add(j1.CreateNewScore(6,3));
        j1.AllScore.add(j1.CreateNewScore(5,1));
    }


    @Test
    public void TestNbredeQuilleTwoTry(){
        Assertions.assertEquals(2, j1.checkNbreTry(j1.AllScore.get(0)));
    }


    @Test
    public void TestNbredeQuilleOneTry(){
        Assertions.assertEquals(1, j1.checkNbreTry(j1.AllScore.get(6)));
    }

    @Test
    public void TestReserve(){
        Assertions.assertTrue(j1.checkreserve(j1.AllScore.get(2)));
    }


    @Test
    public void TestScoreReserve(){
        j1.checkreserve(j1.AllScore.get(2));
        Assertions.assertEquals(27, j1.calculreserve(j1.AllScore.get(3)));

    }

    @Test
    public void TestGreve(){
        Assertions.assertTrue(j1.checkgreve(j1.AllScore.get(6)));
    }

    @Test
    public void TestScoreGreve(){
        j1.checkgreve(j1.AllScore.get(6));
        Assertions.assertEquals(24, j1.calculgreve(j1.AllScore.get(7)));
    }

    @Test
    public void TestAddingLastlancer(){
        Assertions.assertFalse(j1.checkaddinglancer(j1.AllScore.get(9)));
    }

    @Test
    public void TestScore(){
        Assertions.assertEquals(94,j1.checkingFinalScore());
    }

}
