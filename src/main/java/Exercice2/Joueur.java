package Exercice2;

import java.util.*;

public class Joueur {
    public ArrayList <Score> AllScore = new ArrayList<Score>();
    private boolean reserve=false;
    private boolean greve =false;
    private int score=0;


    public Score CreateNewScore(int score_1 , int score_2){
        Score score =  new Score(score_1 , score_2);
        return score;
    }



    public int checkNbreTry(Score scorelancer){

        if(scorelancer.score_1> 0 && scorelancer.score_1<10){
            return 2;
        }
        else if (scorelancer.score_1==10){
            return 1;
        }
        return  -1;
    }

    public boolean checkreserve(Score score_lancer){
        int score_total = score_lancer.score_1 + score_lancer.score_2;
        if((score_lancer.score_1 >=0)&&(score_lancer.score_1 <10)&&(score_total ==10)){
            reserve=true;
            return true;
        }
        reserve =false;
        return false;
    }


    public int calculreserve(Score score_lancer){
        int score_total = score_lancer.score_1 + score_lancer.score_2;
        if(this.reserve){
            int final_score = 10 + score_lancer.score_1 + score_total;
            score = score + final_score;
            this.reserve =false;
            return final_score;
        }
        return 0;
    }

    public boolean checkgreve(Score score_lancer){
        if(score_lancer.score_1 ==10){
            greve=true;
            return true;
        }
        this.greve=false;
        return false;
    }

    public int calculgreve(Score score_lancer){

        int score_total = score_lancer.score_1 + score_lancer.score_2;
        if(this.greve){
            int final_score = 10 + score_total + score_total;
            score = score + final_score;
            this.greve =false;
            return final_score;
        }

       return 0;
    }

    public boolean checkaddinglancer(Score score_lancer){
        return (checkgreve(score_lancer)) || (checkreserve(score_lancer));
    }


    public int checkingFinalScore(){
        Score score_value;
        int already_calc;
        for (Score value : AllScore) {
            score_value = value;
            already_calc = 0;
            if (greve) {
                calculgreve(score_value);
                already_calc = 1;
                greve = false;
            } else if (reserve) {
                calculreserve(score_value);
                already_calc = 1;
                reserve = false;
            }
            checkreserve(score_value);
            checkgreve(score_value);

            if ((!greve) && (!reserve) && (already_calc == 0)) {
                score = score + score_value.score_1 + score_value.score_2;
            }

        }
        System.out.println( "Final Score : " + score);
        return score;
    }

}
