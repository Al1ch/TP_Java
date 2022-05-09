package Exercice1;

public class LoupGarou {
    private String position;

    public LoupGarou(){};

    public void setLoupGarou(String position) {
        this.position = position;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String turningposition(){
        if(this.getPosition() == "North"){
            return "East";
        }
        else if (this.getPosition()== "East") {
            return "South";
        }
        else if (this.getPosition() == "South") {
            return "West";
        }
        else if (this.getPosition() == "West") {
            return "North";
        }
        else{
            return null;
        }


    }
}
