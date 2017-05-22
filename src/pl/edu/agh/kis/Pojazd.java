package pl.edu.agh.kis;

/**
 * Created by wojtek on 22.05.17.
 */
public class Pojazd {
    private String rejestracja;
    private int productionYear;
    private int ownerCount;

    public Pojazd(String rejestracja, int productionYear, int ownerCount) {
        this.rejestracja = rejestracja;
        this.productionYear = productionYear;
        this.ownerCount = ownerCount;
    }

    public int getOwnerCount() {
        return ownerCount;
    }

    public void setOwnerCount(int ownerCount) {
        this.ownerCount = ownerCount;
    }

    public String getRejestracja() {
        return rejestracja;
    }

    public void setRejestracja(String rejestracja) {
        this.rejestracja = rejestracja;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
