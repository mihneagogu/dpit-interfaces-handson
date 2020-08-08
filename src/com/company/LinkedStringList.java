package com.company;

import java.util.LinkedList;

// Nu e o implementare `adevarata` a unui LinkedList, folosesc de fapt LinkedList-ul din java.util,
// dar clasa asta e folosita doar ca sa va arat in Main.java cum se foloseste interfata in relatie cu clasa
// Cand scriem
// "IStringList list = new LinkedStringList();"
// e foarte similar cu
// "List<String> list = new LinkedList();"
// Acelasi lucru se intampla: tipul aparent al variabilei este interfata List<String>, respectiv IStringList
// iar tipul adevarat care implementeaza interfata este LinkedList<String>, respectiv LinkedStringList
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
        return asString();

    }

    @Override
    public int size() {
        return internalList.size();
    }
}
