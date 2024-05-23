package com.training.patterns.iterator;

import java.util.Iterator;

public class SimpleIterator<T> implements Iterator<T> {
    private final T[] objects;
    private int index = 0;

    public SimpleIterator(T[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public T next() {
        return objects[index++];
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        SimpleIterator<Integer> s = new SimpleIterator<>(integers);
        while (s.hasNext()) {
            Integer i = s.next();
            System.out.println(i);
        }
    }
}
