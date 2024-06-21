package com.arraylist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Backend ");
        list.add(0, "Fundamentos");
        String elemento = list.get(0);
        System.out.println(elemento);
        list.set(0, "Programacion web");
        String eliminado = list.remove(1);
        System.out.println(eliminado);
        list.add("Pasteleria");
        boolean result = list.remove("pasteleria");
        System.out.println(result);
        System.out.println(list);
        int size = list.size();
        System.out.println(size);
        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty);
        System.out.println(isEmpty);
        boolean contains = list.contains("Mysql");
        System.out.println(contains);
        int index = list.indexOf("Postgres");
        System.out.println(index); // Output: 0
        list.add("Mysql");
        int lastIndex = list.lastIndexOf("Mysql");
        System.out.println(lastIndex);
        Object[] skills = list.toArray();
        System.out.println(Arrays.toString(skills));
        ArrayList<String> otraLista = new ArrayList<>(Arrays.asList("Python", "Pseint"));
        list.addAll(otraLista);
        // System.out.println(list);
        //-----------------------------------
        // list.addAll(0, otraLista);
        // System.out.println(list);
        //------------------------------------
        // list.removeAll(otraLista);
        // System.out.println(list);
        //------------------------------------
        list.retainAll(Arrays.asList("Python"));
        System.out.println(list);
        // System.out.println(list);
    }
}