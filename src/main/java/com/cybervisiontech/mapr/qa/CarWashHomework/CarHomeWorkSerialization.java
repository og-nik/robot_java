package com.cybervisiontech.mapr.qa.CarWashHomework;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Анна on 01.05.2016.
 */
public class CarHomeWorkSerialization implements Serializable {

    // The method saves input collection of cars to the file
    public static void storeCars(String filepath, List<Car> cars) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath))){
            oos.writeObject(cars);
        } catch (FileNotFoundException fnfe){
            System.err.println("The file is not found");
        } catch (IOException ioe){
            System.err.println("IOException");
        }
    }

    // The method returns collection of cars from a file
    public static List<Car> loadCars(String filepath)  {
        List<Car> c = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath))){
            c = (List<Car>) ois.readObject();
        } catch (FileNotFoundException fnfe){
            System.err.println("The file is not found");
        } catch (IOException ioe){
            System.err.println("IOException");
        } catch (ClassNotFoundException cnfe){
            System.err.println("The class is not found");
        }
        return c;
    }

    // Verification
    public static void main(String[] args) {

        Car c1 = new Truck("AA0739HH", 4);
        Car c2 = new ElectroCar("AA0743HH", 4);
        Car c3 = new ElectroCar("AA2205EX", 4);

        List<Car> carsList = new ArrayList<Car>();

        carsList.add(c1);
        carsList.add(c2);
        carsList.add(c3);

        storeCars("D:\\file_with_cars.dat", carsList);
        List<Car> carsList2 = loadCars("D:\\file_with_cars.dat");
        Iterator iter = carsList2.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
