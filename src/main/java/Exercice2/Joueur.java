package Exercice2;

import Exercice2.Score;

import java.util.*;

public class Joueur {
    private ArrayList <Integer> lancer =  new ArrayList<Integer>();
    public ArrayList <Score> AllScore = new ArrayList<Score>();
    private boolean reserve;
    private boolean greve;
    private ArrayList <Integer> pastScore = new ArrayList<Integer>();
    private int tour=0;
    private int score=0;


    public Score CreateNewScore(int score_1 , int score_2){
        Score score =  new Score(score_1 , score_2);
        return score;
    }


    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    public void setReserve(int tour) {
        this.tour = tour;
    }

    public void setTour(int tour) {
        this.tour = tour;
    }


    public void setGreve(boolean greve) {
        this.greve = greve;
    }


    public void setPastScore(ArrayList<Integer> pastScore) {
        this.pastScore = pastScore;
    }

    public void setLancer(int lancer){
        this.lancer.add(lancer);
    }

    public  void setLancer(int lancer1 , int lancer2){
        this.lancer.add(lancer1);
        this.lancer.add(lancer2);
    }

    public  void setpastScore(int lancer1 , int lancer2){
        this.pastScore.add(lancer1);
        this.pastScore.add(lancer2);
    }

    public int checkNbreTry(Score scorelancer){

        if(scorelancer.score_1> 0 && scorelancer.score_1<10){
            return 2;
        }
        else if (scorelancer.score_1>0 && scorelancer.score_1==10){
            return 1;
        }
        return  -1;
    }

    public boolean checkreserve(Score score_lancer){
        int score_total = score_lancer.score_1 + score_lancer.score_2;
        if((score_lancer.score_1 >0)&&(score_lancer.score_1 <10)&&(score_total ==10)){
            this.reserve=true;
            return this.reserve;
        }
        this.reserve =false;
        return this.reserve;
    }


    public int calculreserve(Score score_lancer){
        int score_total = score_lancer.score_1 + score_lancer.score_2;

        if(this.reserve==true){
            int final_score = 10 + score_lancer.score_1 + score_total;
            score = score + final_score;
            this.reserve =false;
            return final_score;
        }
        else{
            score = score + score_total;
            return score_total;
        }
    }

    public boolean checkgreve(Score score_lancer){
        int score_total = score_lancer.score_1 + score_lancer.score_2;
        if((score_lancer.score_1 >0)&&(score_lancer.score_1 ==10)){
            this.greve=true;
            return this.greve;
        }
        this.greve=false;
        return this.greve;
    }

    public int calculgreve(Score score_lancer){

        int score_total = score_lancer.score_1 + score_lancer.score_2;

        if(this.greve==true){
            int final_score = 10 + 2*score_total;
            score = score + final_score;
            this.greve =false;
            return final_score;
        }
        else{
            score = score + score_total;
            return score_total;
        }
    }

}
