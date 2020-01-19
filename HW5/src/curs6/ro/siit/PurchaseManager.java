package curs6.ro.siit;

public class PurchaseManager {

    public static void processPurchase(Product product, Customer customer) {
        if (product.getQuantity()==0) {
            System.out.println("Product is out of stock");
            return;
        }
        if(customer.getBalance()<product.getPrice()) {
            System.out.println("Customer does not have enough money");
            return;
        }
        if(product.getAgeRestriction().equalsIgnoreCase(Product.AGE_RESTICTION_ADULT_ONLY)){
            if(customer.getAge()<18){
                System.out.println("Customer is too young for this product");
                return;
            }
        }
        customer.setBalance(customer.getBalance()-product.getPrice());
        product.setQuantity(product.getQuantity()-1);

        }

    }
