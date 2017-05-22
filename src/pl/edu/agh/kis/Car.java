package pl.edu.agh.kis;

/**
 * Created by wojtek on 22.05.17.
 */
public class Car extends Pojazd {
    private String color;

    public Car(String rejestracja, int productionYear,int ownerCount,String color) {
        super(rejestracja, productionYear, ownerCount);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
