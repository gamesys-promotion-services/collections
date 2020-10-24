package com.gamesys.collection.iterate;

import java.util.*;

public class ListIterate {

    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("Phone allowance, ");
        listOfString.add("Medicine, ");
        listOfString.add("WFH Allowance, ");
        listOfString.add("Additional Data");

        System.out.print("For each loop: ");
        for (String allowance: listOfString) {
            System.out.print(allowance);
        }
        System.out.println("\n");
        System.out.print("For loop: ");
        for (int i = 0; i < listOfString.size(); i++) {
            System.out.print(listOfString.get(i));
        }

        System.out.println("\n");
        System.out.print("Using stream: ");
        listOfString.stream().forEach(declareAnyVariableHere -> System.out.print(declareAnyVariableHere));
        System.out.println("\n");

        System.out.print("Using Iterator: ");
        Iterator<String> iterator = listOfString.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }

        /** we just add/remove comma on Additional Data/ Phone allowance here -- start */
        listOfString.set(0, "Phone allowance");
        listOfString.set(3, "Additional Data, ");
        /** we just add/remove comma on Additional Data/ Phone allowance here -- end */

        System.out.println("\n");
        System.out.print("Using ListIterator: ");
        /**
         * note that we have specify the last index
         * if we want to use the previous
         */

        ListIterator<String> listIterator = listOfString.listIterator(listOfString.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous());
        }

        System.out.println("\n");
        System.out.print("Using iterable foreach/functional-style loop with parallel: ");
        listOfString.stream().parallel().forEach(System.out::print);
    }

}
