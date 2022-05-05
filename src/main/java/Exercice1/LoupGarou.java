package Exercice1;

public class LoupGarou {
    private String position;

    public LoupGarou() {

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String turningposition(String Actual_position){
        if(Actual_position == "North"){
            return "East";
        }
        else if (Actual_position == "East") {
            return "South";
        }
        else if (Actual_position == "East") {
            return "West";
        }
        else if (Actual_position == "West") {
            return "North";
        }
        else{
            return null;
        }


    }
}
