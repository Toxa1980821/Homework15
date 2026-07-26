import java.util.Arrays;

public class Order {
    private int id;
    private Product[] basket;

    public Order(int id, Product[] basket) {
        this.id = id;
        this.basket = basket;
    }

    @Override
    public String toString() {
        String info = "Заказ[id=";
        info += id;
        info += ", корзина=";
        info += Arrays.toString(basket);
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
        Order other = (Order) obj;

        if (this.id != other.id) {
            return false;
        }

        if (this.basket == other.basket) {
            return true;
        }
        if (this.basket == null || other.basket == null) {
            return false;
        }
        if (this.basket.length != other.basket.length) {
            return false;
        }

        boolean arraysAreEqual = true;
        for (int i = 0; i < this.basket.length; i++) {
            Product p1 = this.basket[i];
            Product p2 = other.basket[i];

            if (p1 == null) {
                if (p2 != null) {
                    arraysAreEqual = false;
                    break;
                }
            } else if (!p1.equals(p2)) {
                arraysAreEqual = false;
                break;
            }
        }

        return arraysAreEqual;
    }
}

