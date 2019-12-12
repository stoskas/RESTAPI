package offers;

import java.util.Comparator;

public class PriceComparatorasc implements Comparator<Product> 
{
    @Override
    public int compare(Product o1, Product o2) {
        return o1.price.compareTo(o2.price);
    }
}