package com.gamesys.collection.entity;

public class PersonWithComparable implements Comparable<PersonWithComparable>{

    private int id;
    private String firstName;
    private String lastName;

    public PersonWithComparable(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "PersonWithComparable{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}' + '\n';
    }

    /**
     * if we want to sort by string,
     * use compareTo instead of -
     */
    @Override
    public int compareTo(PersonWithComparable personWithComparable) {
        return this.id - personWithComparable.id;
    }
}
