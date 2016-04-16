package com.cybervisiontech.mapr.qa;

/**
 * Created by anna on 06.04.16.
 */
public class Car {
    private int speed;
    protected boolean isFull;

    public Car (int speed){
        if (speed >= 0) {
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }

    public Car (){
    }


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

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }

    public boolean refuel(){
        System.out.println("Bul-bul");
        return isFull = true;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (speed != car.speed) return false;
        return isFull == car.isFull;

    }

    @Override
    public int hashCode() {
        int result = speed;
        result = 31 * result + (isFull ? 1 : 0);
        return result;
    }
}
