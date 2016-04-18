package com.cybervisiontech.mapr.qa.CarWashHomework;

/**
 * Created by Анна on 13.04.2016.
 */
public class Truck extends Car {

    @Override
    public void changeWheel(int correctWheelsNumber){
        String className =Truck.class.getSimpleName();
        System.out.println("Correct number of changed wheels for " +
                className + ": " + correctWheelsNumber);
    }

    @Override
    public void wash() {
        System.out.println("The truck is washed.");
    }
}
