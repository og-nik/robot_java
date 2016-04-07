package com.cybervisiontech.mapr.qa;

/**
 * Created by anna on 07.04.16.
 */
public class Student {

    String name;
    String surname;
    int age;
    int course;
    String speciality = "Telecommunication";
    boolean budget = true; // budget or contract type of education
    double price = 0.00; // price for education

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, String surname, int age, int course, String speciality,boolean budget) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.speciality = speciality;
        this.budget = budget;
    }

    public Student(String name, String surname, int age, int course, String speciality, boolean budget, double price) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.speciality = speciality;
        this.budget = budget;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public String getSpeciality() {
        return speciality;
    }

    public boolean isBudget() {
        return budget;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setBudget(boolean budget) {
        this.budget = budget;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double countPrice (boolean budget){
        if (budget == false){
            price = 5000.500;
        }
        return price;
    }
}
