package org.example.LoadBalancer;

import java.util.ArrayList;
import java.util.Iterator;

public class LoadBalancer {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("S1");
        list.add("S2");
        list.add("S3");

        IteratorLoadBalancer iteratorLoadBalancer = new IteratorLoadBalancer(list);
        Iterator<String> iterator = iteratorLoadBalancer.iterator();

        for(int i = 0; i < 30; i++){
            System.out.println(iterator.next());
        }
        /// S1
        /// S2
        /// S3
        /// S1
        /// S2
        /// S3
        /// S1
        /// S2
        /// S3
        /// S1
        /// S2
        /// S3
        /// S1
        /// S2
        /// S3
        /// S1
        /// S2
        /// S3
        /// S1
        /// S2
        /// S3
        /// S1
        /// S2
        /// S3
        /// S1
        /// S2
        /// S3
        /// S1
        /// S2
        /// S3
    }
}
