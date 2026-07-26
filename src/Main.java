//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== ПРОВЕРКА ТОВАРОВ ===");
        Product p1 = new Product(101, "Смартфон", 50000, "Электроника");
        Product p2 = new Product(101, "Смартфон Pro", 75000, "Электроника");
        Product p3 = new Product(102, "Ноутбук", 90000, "Компьютеры");

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));

        System.out.println("\n=== ПРОВЕРКА ЗАКАЗОВ ===");
        Product[] basket1 = {p1, p3};
        Product[] basket2 = {p2, p3};
        Product[] basket3 = {p3, p1};

        Order order1 = new Order("Алексей", basket1);
        Order order2 = new Order("Алексей", basket2);
        Order order3 = new Order("Алексей", basket3);
        Order order4 = new Order("Мария", basket1);

        System.out.println(order1);

        System.out.println("order1.equals(order2): " + order1.equals(order2));
        System.out.println("order1.equals(order3): " + order1.equals(order3));
        System.out.println("order1.equals(order4): " + order1.equals(order4));
    }
}
// Доработка ДЗ

