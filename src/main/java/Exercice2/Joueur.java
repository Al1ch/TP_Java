package Exercice2;

import java.util.*;

public class Joueur {
    private int nbre_tour;
    private ArrayList <Integer> lancer =  new ArrayList<Integer>();
    private boolean reserve = false;
    private boolean greve = false;
    private ArrayList <Integer>

    public int getNbre_tour() {
        return nbre_tour;
    }

    public void setNbre_tour(int nbre_tour) {
        this.nbre_tour = nbre_tour;
    }

    public void setLancer(int lancer){
        this.lancer.add(lancer);
    }

    public  void setLancer(int lancer1 , int lancer2){
        this.lancer.add(lancer1);
        this.lancer.add(lancer2);
    }

    public int checkNbreTry(){
        int score =0;
        if(this.lancer.size()==2){
            return this.lancer.get(0) + this.lancer.get(1);
        }
        return -1;
    }

    public int checkreserve(){
        if(this.reserve==true){
            this.reserve=false;
            return 10 + checkNbreTry();
        }
    }


    public int checkgreve(){
        if(this.greve==true){
            this.greve=false;
            return 10 + checkNbreTry();
        }
    }
}
