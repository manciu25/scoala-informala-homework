package curs6.ro.siit;

public class Appliance extends ElectronicsProduct {
    /**
     * If the qty is less than 50
     * @return 105% of the price
     */
    public double getPrice(){
        if(super.getQuantity()<50){
            return super.getPrice() *1.05;
        }
        return super.getPrice();
    }
}
