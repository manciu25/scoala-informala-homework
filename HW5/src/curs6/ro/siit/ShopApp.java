package curs6.ro.siit;

public class ShopApp {

    public static void main(String[] args) {
        Product product = new Product("car", 20, 3, Product.AGE_RESTICTION_ADULT_ONLY);
        Customer customer = new Customer("Liza", 26, 19 );

        PurchaseManager.processPurchase( product, customer );

    }

}
