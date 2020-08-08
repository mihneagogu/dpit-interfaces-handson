package com.company;

import jdk.jshell.spi.ExecutionControl;

/* Implementare de Set folosind un String[],
   similar cu ArrayStringList
 */
public class ArrayStringSet implements IStringSet {

    /* Sugestii: folositi o structura similara cu cea din ArrayStringList,
       utilizand o dimensiune initiala maxima, un sir de String-uri si un parametru
       unde sa retineti care este dimensiunea actuala
     */

    @Override
    public boolean insert(String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String asString() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }

}
