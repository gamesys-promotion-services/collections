package com.gamesys.collection.exercise;

import com.gamesys.collection.entity.*;

import java.util.*;

/**
 * Exercise
 * Running the main method should sort the
 * List of Employees by Lastname and Balance.
 */
public class LastExercise {


    /**
     * Call the sortEmployeesByLastNameAndBalance and
     * sortEmployeesByBalanceAndLastName method here
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("---------");
    }

    private static List<Employee> sortEmployeesByLastNameAndBalance(List<Employee> employees) {
        return employees;
    }


    private static List<Employee> sortEmployeesByBalanceAndLastName(List<Employee> employees) {
        return employees;
    }

    private static List<Employee> getAllEmployees() {
       return Arrays.asList(
                new Employee("Reyes", 4200.60),
               new Employee("Cruz", 6200.60),
               new Employee("Bautista", 2200.00),
               new Employee("Del Rosario", 200.20),
               new Employee("Ramos", 400.60),
               new Employee("Aquino", 10000.00),
               new Employee("Sadim", 8200.00),
               new Employee("Fernandez", 4500.20),
               new Employee("Smith", 2300.90),
               new Employee("Tolentino", 6400.60),
               new Employee("Evangelista", 1000.20),
               new Employee("Salvador", 2600.60),
               new Employee("Samonte", 2900.60),
               new Employee("Garcia", 3300.60),
               new Employee("Hector", 9900.60),
               new Employee("White", 1000.10),
               new Employee("Jacinto", 4200.20),
               new Employee("Pacquio", 6100.60),
               new Employee("Valdez", 3600.10),
               new Employee("Yambut", 3300.20),
               new Employee("Iglesias", 1000.20)
        );
    }
}
