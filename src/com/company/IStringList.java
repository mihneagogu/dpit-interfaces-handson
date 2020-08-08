package com.company;

public interface IStringList {
    // !!!!!!!!
    // Use .equals to compare between strings
    // !!!!!!!!

    // Adds the given string to the list
    void add(String item);

    // Gets the item at index
    // or returns null if the index is invalid
    String get(int index);

    // Returns whether the list contains the item
    boolean contains(String item);

    // Returns the index of the given item or -1 if it is not in there
    int indexOf(String item);
}
