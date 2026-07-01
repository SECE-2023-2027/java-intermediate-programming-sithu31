package Problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter stock quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter discount percentage: ");
        double discount = scanner.nextDouble();

        Product product = new Product(id, name, price, quantity);
        product.applyDiscount(discount);

        System.out.println(product.getPrice());
        System.out.println(product.getStockQuantity());
        scanner.close();
    }
}
