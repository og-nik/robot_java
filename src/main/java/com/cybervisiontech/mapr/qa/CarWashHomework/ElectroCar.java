package com.cybervisiontech.mapr.qa.CarWashHomework;

/**
 * Created by Анна on 13.04.2016.
 */
public class ElectroCar extends Car {

    public ElectroCar(String carNumber, int wheelsNumber) {
        super(carNumber, wheelsNumber);
    }

    @Override
    public void changeWheel(int correctWheelsNumber){
        if (correctWheelsNumber >= 0 && correctWheelsNumber <= 4) {
            String className = this.getClass().getSimpleName();
            System.out.println("The number of changed wheels for " +
                    className + ": " + correctWheelsNumber);
        } else {
            System.out.println("Incorrect number of wheels to change");
        }
    }

    @Override
    public void wash() {
        System.out.println("The electro-car is clean.");
    }
}
