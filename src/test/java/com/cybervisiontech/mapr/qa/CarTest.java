package com.cybervisiontech.mapr.qa;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anna on 06.04.16.
 */
public class CarTest {

    Car car;

    @Before
    public void setUp(){
        car = new Car();
    }

    @Test
    public void testAccelerate(){
        Car car = new Car();
        assertNotNull("Should be not null", car);
    }

    @Test
    public void testStop(){
        Car car = new Car();
        int speed = car.stop();
        assertTrue(speed >= 0);
    }
}
