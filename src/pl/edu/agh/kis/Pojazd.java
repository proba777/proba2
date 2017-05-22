package pl.edu.agh.kis;

/**
 * Created by wojtek on 22.05.17.
 */
public class Pojazd {
    private String rejestracja;
    private int productionYear;


    public Pojazd(String rejestracja, int productionYear) {
        this.rejestracja = rejestracja;
        this.productionYear = productionYear;
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
