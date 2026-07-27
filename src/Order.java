import java.util.Arrays;
import java.util.Objects;

public class Order {

    private final String customer;
    private final Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        // Arrays.toString корректно вызовет toString() у каждого Product
        return "Заказ[клиент=" + customer + ", корзина=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // Сравнение ссылок
        if (this == obj) {
            return true;
        }
        // Проверка на null и тип
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Order other = (Order) obj;

        // Сравниваем customer с обработкой null
        if (!Objects.equals(this.customer, other.customer)) {
            return false;
        }

        // Если это один и тот же массив — равны
        if (this.basket == other.basket) {
            return true;
        }
        // Если один null, а другой нет — не равны
        if (this.basket == null || other.basket == null) {
            return false;
        }
        // Разные длины — не равны
        if (this.basket.length != other.basket.length) {
            return false;
        }

        // Поэлементное сравнение с учётом порядка
        for (int i = 0; i < this.basket.length; i++) {
            Product p1 = this.basket[i];
            Product p2 = other.basket[i];

            // Обработка null у товаров
            if (p1 == null) {
                if (p2 != null) {
                    return false; // аналог break
                }
            } else {
                // Используем equals класса Product
                if (!p1.equals(p2)) {
                    return false; // при несовпадении сразу выходим
                }
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, Arrays.hashCode(basket));
    }
}
