package com.cybervisiontech.mapr.qa.CarWashHomework;

import java.util.*;


/**
 * Created by Анна on 18.04.2016.
 */
public class CarWash {

    public static void washEverything(Collection<Washable> washables){
        for(Washable element: washables){
            element.wash();
        }
    }

    public static void main(String[] args) {

        Car c1 = new Truck(333, 4);
        Car c2 = new ElectroCar(222, 2);
        Car c3 = new ElectroCar(4444, 4);

        Set<Washable> carsSet = new HashSet<Washable>();
        List<Washable> carsList = new ArrayList<Washable>();

        carsSet.add(c1);
        carsSet.add(c3);
        carsSet.add(c2);
        carsSet.add(c3);

        carsList.add(c1);
        carsList.add(c2);
        carsList.add(c3);
        carsList.add(c1);

        washEverything(carsSet);
        System.out.println();

        washEverything(carsList);
        System.out.println();

        c1.changeWheel(1);
        c2.changeWheel(40);
        c3.changeWheel(2);

    }

}
