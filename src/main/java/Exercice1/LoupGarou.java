package Exercice1;

public class LoupGarou {
    private String position;

    public LoupGarou(){}

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
        return switch (this.getPosition()) {
            case "North" -> "East";
            case "East" -> "South";
            case "South" -> "West";
            case "West" -> "North";
            default -> "";
        };
    }
}
