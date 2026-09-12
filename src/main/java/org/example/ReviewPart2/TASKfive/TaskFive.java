package org.example.ReviewPart2.TASKfive;

public class TaskFive {
    static void main() { // (y, x)-> x.method

        TriFunction<Double, Double, Double, Double> triFunction = (h, l, w) -> h * l * w;
        System.out.println(triFunction.IDKWhatToDo(15.0, 2.0, 6.0));

    }
}
