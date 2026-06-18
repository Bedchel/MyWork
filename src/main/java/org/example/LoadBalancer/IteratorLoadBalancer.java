package org.example.LoadBalancer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class IteratorLoadBalancer implements Iterable<String> {
    private ArrayList<String> arrayList;

    public IteratorLoadBalancer(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public Iterator<String> iterator() {
        return new IteratorObjects();
    }

    private class IteratorObjects implements Iterator<String> {
        private AtomicInteger counter = new AtomicInteger(0);
        int index;

        @Override
        public boolean hasNext() {
            if (index > arrayList.size() - 1) {
                return false;
            }
            return true;
        }

        @Override
        public String next() {
            index = counter.getAndIncrement();
            if (!hasNext()) {
                index = 0;
                counter = new AtomicInteger(1);
                System.out.println(" ");
            }
            return arrayList.get(index);
        }
    }

}