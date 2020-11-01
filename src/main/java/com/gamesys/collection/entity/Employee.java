package com.gamesys.collection.entity;

public class Employee {

    private String lastName;
    private double balance;

    public Employee(String lastName, double balance) {
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return '\n'+"lastName='" + lastName + '\'' +
                ", balance=" + balance;
    }
}
