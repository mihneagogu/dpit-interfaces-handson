package com.company;

import java.util.LinkedList;

// Hacky implementation of IStringList using an already-implemented LinkedList, just for testing purposes
public class LinkedStringList implements IStringList{
    LinkedList<String> internalList = new LinkedList<>();

    public LinkedStringList() {}

    @Override
    public void add(String item) {
        internalList.add(item);
    }

    @Override
    public String get(int index) {
        try {
            return internalList.get(index);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean contains(String item) {
        return internalList.contains(item);
    }

    @Override
    public int indexOf(String item) {
        return internalList.indexOf(item);
    }

    @Override
    public String toString() {
        String res = "[";
        int size = internalList.size();
        for (int i = 0; i < size - 1; i++){
           res += internalList.get(i) + ", ";
        }
        if (size > 0)  {
            res += internalList.get(size - 1);
        }
        res += "]";
        return res;
    }
}
