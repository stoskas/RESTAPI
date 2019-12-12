package offers;

import java.util.Comparator;

public class PriceComparatordesc implements Comparator<Product> 
{
    @Override
    public int compare(Product o1, Product o2) {
        return o2.price.compareTo(o1.price);
    }
}