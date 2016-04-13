package com.cybervisiontech.mapr.qa;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anna on 06.04.16.
 */
public class CarTest {

    Car car;
    Car car2;

    @Before
    public void setUp(){
        car = new Car();
        car2 = new Car(-30);
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

    @Test
    public void testSetGetSpeedNegative(){
        car.setSpeed(-50);
        assertEquals(0, car.getSpeed());
        assertEquals(0, car2.getSpeed());
    }

    @Test
    public void testSetGetSpeedPositive(){
        car.setSpeed(50);
        car2.setSpeed(33);
        assertEquals(50, car.getSpeed());
        assertEquals(33, car2.getSpeed());
    }

    @Test
    public void testSetGetSpeedZero(){
        car.setSpeed(0);
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testSetGetSpeedNull(){
        assertNotNull(car.getSpeed());
        assertEquals(0, car.getSpeed());
    }
}
