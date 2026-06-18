package org.example.Inner.task4;

import java.util.ArrayList;
import java.util.List;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

}

class Main{
    static void main() {
        List<Product> listOfProduct = new ArrayList<>();
        listOfProduct.add(new Product("Apple", 1.3));
        listOfProduct.add(new Product("Orange", 1.99));
        listOfProduct.add(new Product("Stone", 1));
    }
}
