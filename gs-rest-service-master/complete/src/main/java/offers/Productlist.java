package offers;

import java.util.ArrayList;
import java.util.List;

public class Productlist {

    private static List<Product> products;

    public static void createList() {

        products = new ArrayList<Product>();
        products.add(new Product(1, "offer1", 325213, 23842038, "08/12/2019", "21/12/2019"));
        products.add(new Product(2, "offer2", 445, 23842039, "09/12/2019", "26/12/2019"));
        products.add(new Product(3, "offer3", 432663, 23842040, "10/12/2019", "25/12/2019"));
        products.add(new Product(4, "offer4", 6565, 23842041, "11/12/2019", "22/12/2019"));
        products.add(new Product(5, "offer5", 3422, 23842042, "12/12/2019", "27/12/2019"));
        products.add(new Product(6, "offer6", 66721, 23842043, "13/12/2019", "20/12/2019"));
        products.add(new Product(7, "offer7", 645667, 23842044, "14/12/2019", "22/12/2019"));
        products.add(new Product(8, "offer8", 42342, 23842045, "15/12/2019", "24/12/2019"));
        products.add(new Product(9, "offer9", 11357, 23842046, "16/12/2019", "25/12/2019"));
    }

    public static List<Product> GetProducts() {
        return products;
    }

    // return product by Id
    public static Product getProductbyId(int id) {
        for (Product b : products) {
            if (b.getId() == id) {
                return b;

            }
        }
        return null;
    }

    // return product by Code
    public static Product getProductbyCode(long code) {
        for (Product b : products) {
            if (b.getCode() == code) {
                return b;

            }
        }
        return null;

    }

    // return product by Price
    public static Product getProductbyPrice(double price) {

        for (Product b : products) {
            if (b.getPrice() == price) {
                return b;

            }
        }
        return null;

    }

    // create product
    public static Product createProduct(Product new_product) {

        products.add(new_product);
        return new_product;
    }
    // delete product by id
    public static boolean delete(int id){
        int productIndex = -1;
        for(Product b: products) {
            if(b.getId() == id) {
                productIndex = products.indexOf(b);
                continue;
            }
        }
        if(productIndex > -1){
            products.remove(productIndex);
        }
        return true;
    }

}
