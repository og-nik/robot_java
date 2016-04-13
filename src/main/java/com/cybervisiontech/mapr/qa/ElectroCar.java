package com.cybervisiontech.mapr.qa;

/**
 * Created by Анна on 13.04.2016.
 */
public class ElectroCar extends Car {

    @Override
    public boolean refuel() {
        System.out.println("gas-gas");
        return isFull = true;
    }
}
