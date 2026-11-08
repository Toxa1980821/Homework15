import java.util.Objects;

public class Product {
    private final int id;
    private final String name;
    private final int price;
    private final String category;

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Товар[артикул=" + id + ", название=" + name + ", цена=" + price + ", категория=" + category + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // Сравнение ссылок
        if (this == obj) {
            return true;
        }
        // Проверка на null и проверка типа
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Product other = (Product) obj;

        // Сравниваем только id и category
        if (this.id != other.id) {
            return false;
        }
        // category может быть null — используем Objects.equals
        return Objects.equals(this.category, other.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category);
    }
}
