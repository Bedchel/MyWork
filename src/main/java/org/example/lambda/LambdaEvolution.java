package org.example.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// відфільтрувати товари, які коштують дешевше 100 доларів
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

interface ProductFilter {
    boolean test(Product product);
}

class CheapProductFilter implements ProductFilter {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100;
    }
}

public class LambdaEvolution {
    public static void main(String[] args) {
        List<Product> shop = Arrays.asList(
                new Product("Laptop", 1200),
                new Product("Phone", 800),
                new Product("Mouse", 25),
                new Product("Keyboard", 70)
        );

        System.out.println("ЕТАП 1: Звичайний клас");
        List<Product> cheap1 = filterProducts(shop, new CheapProductFilter());
        System.out.println(cheap1);

        System.out.println("\nЕТАП 2: Анонімний клас");

        List<Product> cheap2 = filterProducts(shop, new ProductFilter() {
            @Override
            public boolean test(Product product) {
                return product.getPrice() >= 100;
            }
        });
        System.out.println(cheap2);

        System.out.println("\nЕТАП 3: Лямбда-вираз");
        List<Product> cheap3 = filterProducts(shop, (product) -> product.getPrice() >= 100);
        System.out.println(cheap3);
    }

    public static List<Product> filterProducts(List<Product> products, ProductFilter filter) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (filter.test(p)) {
                result.add(p);
            }
        }
        return result;
    }

}
