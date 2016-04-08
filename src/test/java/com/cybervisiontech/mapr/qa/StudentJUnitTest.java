package com.cybervisiontech.mapr.qa;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by anna on 07.04.16.
 */
public class StudentJUnitTest {

    static Student s1;
    static Student s2;
    static Student s3;
    static Student s4;
    static Student s5;
    static Student s6;


    @BeforeClass
    public static void setUp(){
        s1 = new Student();
        s2 = new Student("Roman");
        s3 = new Student("Olga", "Andreychenko");
        s4 = new Student(25);
        s5 = new Student("Anna", "Ogorodnik", 25, 6, "Computer Science", false);
        s6 = new Student("Oleksandr", "Zabrodsky", 24, 4, "Mathematics", true, 7800.05);
    }

    @Test
    public void testStudent(){
        assertNotNull("Should not be null", s1);
        assertNotNull("Should not be null", s2);
    }

    @Test
    public void testGetName(){
        assertNull("Should be null", s1.getName());
        assertNotNull("Should not be null", s3.getName());
    }

    @Test
    public void testGetSurname(){
        assertNull("Should be null", s1.getSurname());
        assertNotNull("Should not be null", s3.getSurname());
    }

    @Test
    public void testGetAge(){
        assertNotNull("Should not be null", s1.getAge());
        assertNotNull("Should not be null", s4.getAge());
        assertTrue(s1.getAge() == 0);
        assertTrue(s4.getAge() == 25);
    }

    @Test
    public void testGetCourse(){
        assertNotNull("Should not be null", s1.getCourse());
        assertTrue(s1.getCourse() == 1);
        assertTrue(s5.getCourse() == 6);
    }

    @Test
    public void testGetSpeciality(){
        assertNull("Should be null", s1.getSpeciality());
        assertNotNull("Should not be null", s5.getCourse());
    }

    @Test
    public void testIsBudget(){
        assertNotNull("Should not be null", s1.isBudget());
        assertTrue(s1.isBudget() == true);
        assertTrue(s5.isBudget() == false);
    }

    @Test
    public void testGetPrice(){
        assertNotNull("Should not be null", s1.getPrice());
        assertTrue(s1.getPrice() == 0.00);
        assertTrue(s3.getPrice() == 0.00);
        assertTrue(s5.getPrice() == 0.00);
        assertTrue(s6.getPrice() == 7800.05);
    }

    @Test
    public void testSetPrice(){
        s1.setPrice();
        double price1 = s1.getPrice();
        assertTrue(price1 == 0);

        s2.setPrice();
        double price2 = s2.getPrice();
        assertTrue(price2 == 0);

        s5.setPrice();
        double price5 = s5.getPrice();
        assertTrue(price5 == 8000.600);

        double price6 = s6.getPrice();
        assertTrue(price6 == 7800.05);

        s6.setPrice();
        double price6New = s6.getPrice();
        assertTrue("Should equal 0", price6New == 0);
        }


}
