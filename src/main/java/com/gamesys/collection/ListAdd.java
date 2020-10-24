package com.gamesys.collection;

import com.gamesys.collection.entity.*;

import java.util.*;

public class ListAdd {

    static Iterable<String> iterableString = new ArrayList<>();
    static Collection<String> collectionString = new ArrayList<>();
    static List<String> listString = new ArrayList<>();
    static ArrayList<String> arrayListString = new ArrayList<>();
    static List<Integer> listInteger = new ArrayList<>();
    static List<Person> listOfPerson = new ArrayList<>();

    /**
     * Here we can call the "add" method to
     * increase our items on our list, but as you can notice
     * Iterable does not have the method add.
     */
    public static void main(String[] args) {
        listOfPerson.add(new Person());
        listInteger.add(2020);
        arrayListString.add("sample text");
        listString.add("sample text #2");
        collectionString.add("sample text #3");
//        iterableString.add("add not available");
    }
}
