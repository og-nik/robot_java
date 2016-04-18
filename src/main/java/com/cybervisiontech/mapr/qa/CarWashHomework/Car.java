package com.cybervisiontech.mapr.qa.CarWashHomework;

/**
 * Created by anna on 06.04.16.
 */
public abstract class Car implements Washable {

    public int carNumber;
    public int wheelsNumber;

    public void changeWheel(int wheelsNumber){
        String className = Car.class.getName();
        System.out.println(className);
        System.out.println("Number of wheels: " + wheelsNumber);
    }

}
