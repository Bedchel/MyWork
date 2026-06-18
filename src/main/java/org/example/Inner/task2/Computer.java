package org.example.Inner.task2;

public class Computer {
    private String brand;
    private boolean isPowerOn;

    public Computer(String brand, boolean isPowerOn) {
        this.brand = brand;
        this.isPowerOn = isPowerOn;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    class Processor {
        public void executeTask(String task) throws Exception {
            if (isPowerOn) {
                System.out.println(STR."Процесор бренду \{brand} виконує задачу \{task}.");
            } else {
                throw new Exception("Компютер вимкнутий");
            }
        }
    }
}
