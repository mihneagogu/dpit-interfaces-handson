package com.company;

public interface IStringList {
    // !!!!!!!!
    // Folositi metoda .equals din String ca sa comparati Stringuri intre ele
    // !!!!!!!!

    // Adauga `item` la lista
    void add(String item);

    // Returneaza elementul la indicele cerut
    // sau `null` daca nu exista
    String get(int index);

    // Returneaza daca exista elementul `item` in lista
    boolean contains(String item);

    // Returneaza indicele din lista unde se afla `item`, iar daca nu exista, returneaza -1
    int indexOf(String item);

    // Returneaza cate elemente sunt in lista
    int size();

    /* Asta se numeste o metoda `default` pentru interfate, nu apare in curs pentru ca nu avem timp
    sa acoperim si metodele default, dar explic aici si cititi voi singuri.
    metoda asta e folosita pur pentru a apela metoda toString() si formateaza lista frumos.
    Unde vedeti `this`, este vorba de clasa care implementeaza interfata. Asadar se poate apela metoda asta
    de formatare pentru orice clasa (* sau interfata) care implementeaza IStringList

    Daca nu va dati exact seama ce face, folositi debugger-ul sa vedeti cum se apeleaza
     */
    default String asString() {
        String res = "[";
        int size = this.size();
        for (int i = 0; i < size - 1; i++){
            res += this.get(i).toString() + ", ";
        }
        if (size > 0)  {
            res += this.get(size - 1).toString();
        }
        res += "]";
        return res;
    }
}
