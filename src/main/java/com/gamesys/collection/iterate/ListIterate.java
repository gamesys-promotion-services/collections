package com.gamesys.collection.iterate;

import java.util.*;

public class ListIterate {

    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("Phone allowance, ");
        listOfString.add("Medicine, ");
        listOfString.add("WFH Allowance, ");
        listOfString.add("Additional Data");

        System.out.print("Orig List: ");
        for (String allowance: listOfString) {
            System.out.print(allowance);
        }
        /**
         * Exercise!
         * Remove the Medicine
         */

        System.out.println();
        System.out.print("New list: ");
        for (String allowance: listOfString) {
            System.out.print(allowance);
        }

    }

}
