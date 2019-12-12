package offers;

public class Product {
    private int id;
    private String name;
    public Double price;
    private long code;
    private String expiration_date;
    private String availability_date;

    public Product() {
    }

    public Product(int id, String name, double price, long code, String expiration_date, String availability_date) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setCode(code);
        this.setExpiration_date(expiration_date);
        this.setAvailability_date(availability_date);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getCode() {
        return this.code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getAvailability_date() {
        return this.availability_date;
    }

    public void setAvailability_date(String availability_date) {
        this.availability_date = availability_date;
    }

}
