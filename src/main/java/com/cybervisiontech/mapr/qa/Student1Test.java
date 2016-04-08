package com.cybervisiontech.mapr.qa;

/**
 * Created by anna on 07.04.16.
 */
public class Student1Test {

    public static void main(String[] args) {

        // Default student (Empty constructor)
        Student defaultStudent = new Student();
        System.out.println("Name: " + defaultStudent.getName());
        System.out.println("Surname: " + defaultStudent.getSurname());
        System.out.println("Age: " + defaultStudent.getAge());
        System.out.println("Course: " + defaultStudent.getCourse());
        System.out.println("Speciality: " + defaultStudent.getSpeciality());
        System.out.println("Budget: " + defaultStudent.isBudget());
        System.out.println("Education cost: " + defaultStudent.getPrice());
        defaultStudent.setPrice();
        System.out.println("Education cost: " + defaultStudent.getPrice());
        System.out.println();

        // Test student 1
        Student student = new Student("Roman");
        System.out.println("Student: " + student.getName());
        student.setName("Murshid");
        System.out.println("Student: " + student.getName());
        student.setSurname("Chalaev");
        System.out.println("Surname: " + student.getSurname());
        student.setAge(25);
        System.out.println("Age: " + student.getAge());
        System.out.println("Education cost: " + student.getPrice());
        student.setBudget(false);
        student.setPrice();
        System.out.println("Education cost: " + student.getPrice());
        System.out.println();

        // Test student 2
        Student student2 = new Student("Olga", "Andreychenko");
        System.out.println("Surname: " + student2.getSurname());
        student2.setCourse(5);
        System.out.println("Course: " + student2.getCourse());
        student2.setSpeciality("Mathematics");
        System.out.println("Speciality: " + student2.getSpeciality());
        student2.setBudget(false);
        System.out.println("Education cost: " + student2.getPrice());
        student2.setPrice();
        System.out.println("Education cost: " + student2.getPrice());
        System.out.println();

        //Test student 3
        Student student3 = new Student(25);
        System.out.println("Age: " + student3.getAge());
        System.out.println();

        //Test student 4
        Student student4 = new Student("Anna", "Ogorodnik", 25, 6, "Computer Science", true);
        System.out.println("Name: " + student4.getName());
        System.out.println("Surname: " + student4.getSurname());
        System.out.println("Age: " + student4.getAge());
        System.out.println("Course: " + student4.getCourse());
        System.out.println("Speciality: " + student4.getSpeciality());
        System.out.println("Budget: " + student4.isBudget());
        student4.setPrice();
        System.out.println("Price: " + student4.getPrice());
        System.out.println();

        // Test student 5
        Student student5 = new Student("Oleksandr", "Zabrodsky", 24, 4, "Mathematics", true, 7800.05);
        System.out.println("Price: " + student5.getPrice());
        student5.setPrice();
        System.out.println("Price: " + student5.getPrice());
        System.out.println();

    }
}
