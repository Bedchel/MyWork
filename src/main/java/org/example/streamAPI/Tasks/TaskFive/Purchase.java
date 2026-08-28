package org.example.streamAPI.Tasks.TaskFive;

public record Purchase(String item, int quantity, double pricePerUnit) {

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }
}

