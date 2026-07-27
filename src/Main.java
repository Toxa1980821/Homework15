//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("=== ТЕСТИРОВАНИЕ Product ===");

        // Товары с одинаковым id и категорией
        Product p1 = new Product(101, "Смартфон", 50000, "Электроника");
        Product p2 = new Product(101, "Смартфон Pro", 75000, "Электроника");

        // Товар с другим id и категорией
        Product p3 = new Product(102, "Ноутбук", 90000, "Компьютеры");

        // Товар с тем же id, но другой категорией
        Product p4 = new Product(101, "Наушники", 15000, "Аудио");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        // Явные тесты equals для Product
        System.out.println("p1.equals(p2) (одинаковые id и категория): " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3) (разные id и категория): " + p1.equals(p3)); // false
        System.out.println("p1.equals(p4) (одинаковый id, разная категория): " + p1.equals(p4)); // false

        System.out.println("\n=== ТЕСТИРОВАНИЕ Order ===");

        Product[] basket1 = {p1, p3};
        Product[] basket2 = {p2, p3};
        Product[] basket3 = {p3, p1};
        Product[] basket4 = {p1, p3};

        Order order1 = new Order("Алексей", basket1);
        Order order2 = new Order("Алексей", basket2);
        Order order3 = new Order("Алексей", basket3);
        Order order4 = new Order("Мария", basket1);
        Order order5 = new Order("Алексей", basket4);

        System.out.println(order1);

        // Тесты equals для Order
        System.out.println("order1.equals(order2) (товары равны по equals, порядок совпадает): "
                + order1.equals(order2));

        System.out.println("order1.equals(order3) (нарушен порядок товаров): "
                + order1.equals(order3));

        System.out.println("order1.equals(order4) (другой клиент): "
                + order1.equals(order4));

        System.out.println("order1.equals(order5) (полностью идентичный заказ): "
                + order1.equals(order5));
    }
}

