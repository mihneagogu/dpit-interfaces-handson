package com.company;

/* Interfata pentru un Set de String-uri
   Elementele sunt introduse in Set fara a se repeta

 */
public interface IStringSet {

    // Incearca sa introduca un element in set si returneaza
    // daca setul a fost schimbat (daca se returneaza `false` inseamna ce elementul era deja in set)
    boolean insert(String element);

    // Returneaza daca elementul este prezent in set
    boolean contains(String element);

    // Formateaza setul intr-un format citibil
    String asString();

    // Returneaza cate elemente sunt in set
    int size();
}
