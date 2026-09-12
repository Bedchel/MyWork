package org.example.ReviewPart2;

import java.util.HashMap;

public class testTeoritcal {
    static void main() {


        HashMap<Integer, String> test = new HashMap<>();
        int testInt = 10;
        test.put(testInt, "aaa");
        System.out.println(test.get(testInt));
        testInt = 12;
        System.out.println(test.get(testInt));
    }
}
