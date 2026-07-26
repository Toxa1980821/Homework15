//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== ПРОВЕРКА ТОВАРОВ ===");
        Product p1 = new Product(101, "Смартфон", 50000, "Электроника");
        Product p2 = new Product(101, "Смартфон Pro", 75000, "Электроника"); // равен p1 по id и категории
        Product p3 = new Product(102, "Ноутбук", 90000, "Компьютеры");

        System.out.println(p1);
        System.out.println(p2);

        String compP12 = "Товары p1 и p2 равны (id и категория совпадают): ";
        compP12 += p1.equals(p2);
        System.out.println(compP12);

        System.out.println("\n=== ПРОВЕРКА ЗАКАЗОВ ===");
        Product[] basket1 = {p1, p3};
        Product[] basket2 = {p2, p3};
        Product[] basket3 = {p3, p1};

        Order order1 = new Order(1, basket1);
        Order order2 = new Order(1, basket2);
        Order order3 = new Order(1, basket3);

        System.out.println(order1);

        String compO12 = "Заказы order1 и order2 равны (id совпадает, корзины эквивалентны по порядку): ";
        compO12 += order1.equals(order2);
        System.out.println(compO12);

        String compO13 = "Заказы order1 и order3 равны (нарушен порядок в массиве -> сработает break): ";
        compO13 += order1.equals(order3);
        System.out.println(compO13);
    }
}

