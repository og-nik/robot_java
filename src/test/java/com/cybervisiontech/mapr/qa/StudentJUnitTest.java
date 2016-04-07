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

    static Student student;

    @BeforeClass
    public static void setUp(){
        student = new Student();
    }

    @Test
    public void testStudent(){
        assertNotNull("Should not be null", student);
    }

    @Test
    public void testGetName(){
        assertNull("Should be null", student.getName());
    }

    @Test
    public void testGetSurname(){
        assertNull("Should be null", student.getSurname());
    }

    @Test
    public void testGetAge(){
        assertNotNull("Should not be null", student.getAge());
    }

    @Test
    public void testGetCourse(){
        assertNotNull("Should not be null", student.getCourse());
    }

    @Test
    public void testGetSpeciality(){
        assertNotNull("Should not be null", student.getSpeciality());
    }

    @Test
    public void testIsBudget(){
        assertNotNull("Should not be null", student.isBudget());
    }

    @Test
    public void testGetPrice(){
        assertNotNull("Should not be null", student.getPrice());
    }

    @Test
    public void testCountPrice(){
        boolean budget = student.isBudget();
        double price = student.countPrice(budget);
        assertTrue(price >= 0);
        }



}
