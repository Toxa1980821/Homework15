import java.util.Objects;

public class Product {

    private int id;
    private String name;
    private int price;
    private String category;

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        String info = "Товар[артикул=";
        info += id;
        info += ", название=";
        info += name;
        info += ", цена=";
        info += price;
        info += ", категория=";
        info += category;
        info += "]";
        return info;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return this.id == other.id && Objects.equals(this.category, other.category);
    }
}


