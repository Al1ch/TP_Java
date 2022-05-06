package TestExercice2;
import Exercice2.Joueur;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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
        j1.setLancer(7);
        Assertions.assertEquals(7, j1.checkNbreTry());
    }


    @Test
    public void TestScoreReserve(){
        Joueur j1 = new Joueur();
        j1.setReserve(true);
        j1.setLancer(3,7);
        Assertions.assertEquals(20, j1.checkreserve());

    }

    @Test
    public void TestScoreGreve(){
        Joueur j1 = new Joueur();
        j1.setGreve(true);
        j1.setpastScore(7,2);
        Assertions.assertEquals(29, j1.checkgreve());

    }


    @Test
    public void TestDernierCadre(){

    }

    @Test
    public void ScoreTotal(){

    }

}
