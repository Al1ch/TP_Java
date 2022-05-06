package Exercice2;

import java.util.*;

public class Joueur {
    private ArrayList <Integer> lancer =  new ArrayList<Integer>();
    private boolean reserve =true;
    private boolean greve;
    private ArrayList <Integer> pastScore = new ArrayList<Integer>();


    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    public boolean isGreve() {
        return greve;
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
        this.lancer.add(lancer1);
        this.lancer.add(lancer2);
    }

    public int checkNbreTry(){
        int score =0;
        if(this.lancer.size()==2){
            score =this.lancer.get(0) + this.lancer.get(1);
            System.out.println("SCORE " + score);
            return score;
        }
        else{
            return this.lancer.get(0);
        }

    }

    public int checkreserve(){
        if(this.reserve==true){
            this.reserve=false;
            return 10 + checkNbreTry();
        }
        else{
            return 0;
        }
    }


    public int checkgreve(){
        if((this.greve==true)&&(this.pastScore.size()==2)){
            this.greve=false;
            return 20 + this.pastScore.get(0) + this.pastScore.get(1);
        }
        else{
            return -1;
        }
    }
}
