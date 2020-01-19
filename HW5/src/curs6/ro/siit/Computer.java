package curs6.ro.siit;

public class Computer extends ElectronicsProduct {
    public void setGuaranteePeriod() {
        this.guaranteePeriod = 24;
    }
    /**
     * If the qty is over 1000
     * @return 95% of the price
     */
    public double getPrice() {
        if (super.getQuantity() > 1000) {
            return super.getPrice() * 0.95;
        }
        return super.getPrice();

    }
}
