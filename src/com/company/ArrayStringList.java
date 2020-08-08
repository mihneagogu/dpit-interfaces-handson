package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayStringList implements IStringList {

    private static final int INITIAL_SIZE = 16;
    private int currentMaxSize = INITIAL_SIZE;
    private String[] values;
    private int size = 0;

    public ArrayStringList() {
        this.values = new String[INITIAL_SIZE];
    }

    @Override
    public void add(String item) {
        if (size == currentMaxSize) {
            resize();
        }
        values[size] = item;
        size++;
    }

    private void resize() {
        int oldSize = currentMaxSize;
        currentMaxSize *= 2;
        String[] oldValues = values;
        values = new String[currentMaxSize];
        for (int i = 0; i < oldSize; i++) {
            values[i] = oldValues[i];
        }
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return values[index];
    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < size; i++) {
            if (values[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (values[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return this.asString();
    }


    @Override
    public int size() {
        return size;
    }
}
