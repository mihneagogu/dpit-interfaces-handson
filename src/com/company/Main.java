package com.company;

public class Main {

    public static void main(String[] args) {
        IStringList list = new LinkedStringList();
        System.out.println(list.get(1)); // null

        System.out.println(list.asString());
        list.add("Asdasd");
        list.add("dpit");
        list.add("curs");
        System.out.println(list.asString());

        System.out.println(list.indexOf("dpit")); // 1
        System.out.println(list.contains("asd")); // false
        System.out.println(list.contains("curs")); // true

        System.out.println(list.indexOf("monkey")); // -1
        System.out.println(list.indexOf("curs")); // 2


    }
}
