package org.example.ReviewPart2;

import java.util.List;
import java.util.stream.Collectors;

public class TaskSeven {
    static void main() {
        List<Order> orders = List.of(
                new Order(1, "Electronics", 1200.0),
                new Order(2, "Books", 350.0),
                new Order(3, "Electronics", 450.0),
                new Order(4, "Books", 150.0),
                new Order(5, "Clothing", 800.0)
        );
        System.out.println(orders.stream().collect(Collectors.groupingBy(Order::category)));
        System.out.println(orders.stream().collect(Collectors.groupingBy(Order::category, Collectors.summingDouble(Order::price))));
    }
}
record Order(long ID, String category, double price){
}