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

    public String LoupRotation(int nbre_rotation){
        for(int i=0 ; i<nbre_rotation ; i++){
            turningposition();
        }
        return this.position;
    }


    public String turningposition(){
        if(this.getPosition() == "North"){
            this.position = "East";
            return this.position;
        }
        else if (this.getPosition()== "East") {
            this.position = "South";
            return this.position;
        }
        else if (this.getPosition() == "South") {
            this.position = "West";
            return this.position;
        }
        else if (this.getPosition() == "West") {
            this.position = "North";
            return this.position;
        }
        else{
            return null;
        }
    }
}
