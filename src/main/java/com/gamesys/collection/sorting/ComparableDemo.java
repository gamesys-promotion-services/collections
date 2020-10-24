package com.gamesys.collection.sorting;

import com.gamesys.collection.entity.*;

import java.util.*;

public class ComparableDemo {

    public static void main(String[] args) {
        List<PersonWithComparable> employees = getAllEmployee();
        Collections.sort(employees);

        System.out.println(employees);

//        List<Person> employeesWithoutComparable = getAllEmployeeWithoutComparable();
//        Collections.sort(employeesWithoutComparable);
    }

    private static List<PersonWithComparable> getAllEmployee() {
        return Arrays.asList(
                new PersonWithComparable(131, "john", "doe"),
                new PersonWithComparable(130, "jane", "doe"),
                new PersonWithComparable(132, "jim", "doe"),
                new PersonWithComparable(350, "johnny", "shark"),
                new PersonWithComparable(912, "baby", "melon"),
                new PersonWithComparable(910, "coco", "johnny")
        );
    }

    private static List<Person> getAllEmployeeWithoutComparable() {
        return Arrays.asList(
                new Person(131, "john", "doe"),
                new Person(130, "jane", "doe"),
                new Person(132, "jim", "doe"),
                new Person(350, "johnny", "shark"),
                new Person(912, "baby", "melon"),
                new Person(910, "coco", "johnny")
        );
    }
}
