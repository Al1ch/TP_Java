package Exercice2;

import java.util.*;

public class Joueur {
    private ArrayList <Integer> lancer =  new ArrayList<Integer>();
    private boolean reserve =true;
    private boolean greve;
    private ArrayList <Integer> pastScore = new ArrayList<Integer>();
    private int tour=0;
    private int score=0;


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

    public int checkNbreTry(){
        if(this.lancer.size()==2){
            int score_lancer = this.lancer.get(0) + this.lancer.get(1);
            score = score +  score_lancer;
            return score;
        }
        else{
            score += this.lancer.get(0);
            return this.lancer.get(0);
        }

    }

    public int checkreserve(){
        if(this.reserve==true){
            this.reserve=false;
            int score_lancer = 10 + checkNbreTry() + checkNbreTry();
            score = score + score_lancer;
            return score_lancer;
        }
        else{
            return 0;
        }
    }


    public int checkgreve(){
        if((this.greve==true)&&(this.pastScore.size()==2)){
            this.greve=false;
            int score1_after_greve =  10 + this.pastScore.get(0) + this.pastScore.get(0);
            int score2_after_greve =  10 + this.pastScore.get(1) + this.pastScore.get(1);

            score = score + score1_after_greve + score2_after_greve;
            return score1_after_greve + score2_after_greve;
        }
        else{
            return -1;
        }
    }
    

}
