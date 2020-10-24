package com.gamesys.collection;

import java.util.*;

public class ListRemoveElement {

    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("Phone allowance, ",
                "Medicine, ", "WFH Allowance, ", "Additional Data");
        String beerAllowance = "Beer Allowance, ";
        System.out.print("Orig List: ");
        for (String allowance: listOfString) {
            System.out.print(allowance);
        }
        /**
         * Exercise!
         * Remove the Medicine and replace it with Beer allowance
         */

        System.out.println();
        System.out.print("New list: ");
        for (String allowance: listOfString) {
            System.out.print(allowance);
        }

    }

}
