package com.cybervisiontech.mapr.qa;

/**
 * Created by anna on 06.04.16.
 */
public class Car {
    private  int speed;

    public int getSpeed() {
        return speed;
    }

    public int accelerate(){
        speed += 10;
        return speed;
    }

    public int stop(){
        speed -= 10;
        if (speed < 0){
            speed = 0;
        }
        return speed;
    }
}
