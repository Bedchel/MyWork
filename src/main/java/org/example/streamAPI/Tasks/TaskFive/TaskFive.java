package org.example.streamAPI.Tasks.TaskFive;

import java.util.List;
import java.util.stream.Collectors;

public class TaskFive {
    static List<Purchase> cart = List.of(
            new Purchase("Laptop", 1, 35000.0),
            new Purchase("PC Mouse", 2, 800.0),
            new Purchase("KeyBoard", 1, 2500.0),
            new Purchase("item1", 3, 20.0),
            new Purchase("item2", 1, 6000.0),
            new Purchase("item3", 2, 7800.7),
            new Purchase("item4", 1, 20.15),
            new Purchase("item5", 3, 250.2)
    );

    static void main() {
        double sum = 0;

        for (Purchase purchase : cart) {
            sum += purchase.pricePerUnit() * purchase.quantity();
        }
        System.out.println(sum);

        System.out.println(cart.stream().map(Purchase::getTotalPrice).sorted().collect(Collectors.toList()).getLast());



    }

}
