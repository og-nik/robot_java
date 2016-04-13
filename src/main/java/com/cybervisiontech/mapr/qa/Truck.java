package com.cybervisiontech.mapr.qa;

/**
 * Created by Анна on 13.04.2016.
 */
public class Truck extends Car {

    private boolean isLoaded;

    public boolean open(){
        System.out.println("Not loaded");
        return isLoaded = false;
    }

    public boolean load(){
        System.out.println("Loaded");
        return isLoaded = true;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

}
