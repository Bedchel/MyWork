package org.example.HomeWorkReview.PractiacalTasks;

class Task11 {
    static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.findingTheBig();
        rectangle.findingTheBig();
    }
}


abstract class Shape {
    public abstract void findingTheBig();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void findingTheBig() {
        double area = Math.PI * radius * radius;
        System.out.printf("Площа кола: %.2f\n", area);
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void findingTheBig() {
        double area = width * height;
        System.out.printf("Площа прямокутника: %.2f\n", area);
    }
}