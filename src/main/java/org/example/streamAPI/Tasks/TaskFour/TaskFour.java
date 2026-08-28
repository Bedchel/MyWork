package org.example.streamAPI.Tasks.TaskFour;

import java.util.List;

public class TaskFour {
    static List<Product> products = List.of(
            new Product("Headphone", "Electronics", 2500.0, true),
            new Product("KeyBoard", "Electronics", 400.0, false),
            new Product("Phone", "Electronics", 15000.0, true),
            new Product("Fridge", "Appliances", 22000.0, true)
    );

    static void main() {
        products.stream().filter(product -> product.price() <= 10000)
                .filter(Product::inStock).filter(product -> product.category().equals("Electronics")).findFirst()
                .ifPresent(product -> System.out.print("Name: " + product.name() + " Price: " + product.price()));

    }
}
