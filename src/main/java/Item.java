import java.util.Date;

public class Item {
    private String name;
    private Double price;
    private String type;
    private Date expiration;

    public Item() {
        this.name = null;
        this.price = null;
        this.type = null;
        this.expiration = null;
    }

    public Item(String name, Double price, String type, Date expiration) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.expiration = expiration;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public Date getExpiration() {
        return expiration;
    }
}
