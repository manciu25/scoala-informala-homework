package curs6.ro.siit;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.util.Date;
import static java.time.temporal.ChronoUnit.DAYS;

public class FoodProduct extends Product implements Expirable {

    public double getPrice(){
        long daysBetween = DAYS.between((Temporal) this.getExpirationDate(), LocalDate.now());
        if(daysBetween > 15){
            return super.getPrice()*0.75;
        }
        return super.getPrice();
    }

    @Override
    public Date getExpirationDate() {
        return null;
    }
}
