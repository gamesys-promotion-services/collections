package com.gamesys.collection.sorting;

import java.util.*;

public class Sorting {

    private static List<String> sampleList = Arrays.asList(
            "phone allowance, ",
            "medicine allowance, ",
            "WFH allowance, ",
            "additional Data allowance, "
    );

    public static void main(String[] args) {
        System.out.println("original list: ");
        sampleList.stream().forEach(System.out::print);

        System.out.println("\n\nCollections sort called: ");
        Collections.sort(sampleList);;
        sampleList.stream().forEach(System.out::print);

        System.out.println("\n\nCASE_INSENSITIVE_ORDER: ");
        sampleList.sort(String.CASE_INSENSITIVE_ORDER);
        sampleList.stream().forEach(System.out::print);

        System.out.println("\n\nComparator naturalOrder: ");
        sampleList.sort(Comparator.naturalOrder());
        sampleList.stream().forEach(System.out::print);

        System.out.println("\n\nComparator reverseOrder: ");
        sampleList.sort(Comparator.reverseOrder());
        sampleList.stream().forEach(System.out::print);

    }


}
