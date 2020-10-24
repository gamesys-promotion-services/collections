package com.gamesys.collection.sorting;

import com.gamesys.collection.entity.*;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {

        Comparator<Person> compareById = Comparator.comparing(Person::getId);

        Comparator<Person> compareByLastName = Comparator.comparing(Person::getLastName);

        Comparator<Person> compareByIdAndLastName = compareByLastName.thenComparing(compareById);

        List<Person> personList = getListOfPerson();
        personList.stream().forEach(anyVariable -> System.out.print(anyVariable));

        System.out.println("\nSorted list: ");
        Collections.sort(personList, compareByIdAndLastName);
        personList.stream().forEach(anyVariable -> System.out.print(anyVariable));

        /**
         * Exercise!
         * Create a Comparator that will sort by firstname and id
         * Update the 3 records of getListOfPerson method by putting 'a', 'b' and 'c'
         * e.g. Ziri will be aZiri, bZiri....
         * Print out the result
         */

        System.out.println("\nAnother Sorted list for exercise: ");
    }

    private static List<Person> getListOfPerson() {
        return Arrays.asList(
                new Person(1, "Ziri", "Sadim-Zuckerberg"),
                new Person(131, "Ziri", "Sadim-Talavera"),
                new Person(369, "Ziri", "Sadim-Tan"),
                new Person(453, "Ziri", "Sadim-Tan"),
                new Person(123, "Ziri", "Sadim-Tan"),
        new Person(143, "Ziri", "Sadim-Rubia")
        );
    }
}
