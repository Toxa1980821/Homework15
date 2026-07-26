import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Заказ[клиент=" + customer + ", корзина=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Order other = (Order) obj;

        if (!Objects.equals(this.customer, other.customer)) return false;

        if (this.basket == other.basket) return true;
        if (this.basket == null || other.basket == null) return false;
        if (this.basket.length != other.basket.length) return false;

        for (int i = 0; i < this.basket.length; i++) {
            Product p1 = this.basket[i];
            Product p2 = other.basket[i];

            if (p1 == null) {
                if (p2 != null) return false;
            } else if (!p1.equals(p2)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, Arrays.hashCode(basket));
    }
}
//Доработка ДЗ