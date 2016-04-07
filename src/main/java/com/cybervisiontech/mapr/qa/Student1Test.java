package com.cybervisiontech.mapr.qa;

/**
 * Created by anna on 07.04.16.
 */
public class Student1Test {

    public static void main(String[] args) {

        Student defaultStudent = new Student();
        System.out.println("Name: " + defaultStudent.getName());
        System.out.println("Surname: " + defaultStudent.getSurname());
        System.out.println("Age: " + defaultStudent.getAge());
        System.out.println("Course: " + defaultStudent.getCourse());
        System.out.println("Speciality: " + defaultStudent.getSpeciality());
        System.out.println("Budget: " + defaultStudent.isBudget());
        System.out.println("Education cost: " + defaultStudent.countPrice(defaultStudent.isBudget()));
        System.out.println();

        Student student = new Student("Roman");
        System.out.println("Student: " + student.getName());
        student.setName("Murshid");
        System.out.println("Student: " + student.getName());
        student.setSurname("Chalaev");
        System.out.println("Surname: " + student.getSurname());
        student.setAge(25);
        System.out.println("Age: " + student.getAge());
        System.out.println("Speciality: " + student.getSpeciality());
        System.out.println("Education cost: " + student.countPrice(student.isBudget()));
        System.out.println();


        Student student2 = new Student("Olga", "Andreychenko");
        System.out.println("Surname: " + student2.getSurname());
        student2.setCourse(5);
        System.out.println("Course: " + student2.getCourse());
        student2.setSpeciality("Mathematics");
        System.out.println("Speciality: " + student2.getSpeciality());
        student2.setBudget(false);
        System.out.println("Education cost: " + student2.countPrice(student2.isBudget()));
        System.out.println();


        Student student3 = new Student(25);
        System.out.println("Age: " + student3.getAge());
        System.out.println();

        Student student4 = new Student("Anna", "Ogorodnik",25,5,"Informatics",true);
        System.out.println("Name: " + student4.getName());
        System.out.println("Surname: " + student4.getSurname());
        System.out.println("Age: " + student4.getAge());
        System.out.println("Course: " + student4.getCourse());
        System.out.println("Speciality: " + student4.getSpeciality());
        System.out.println("Budget: " + student4.isBudget());
        System.out.println("Price: " + student4.countPrice(student4.isBudget()));
        System.out.println();






    }
}
