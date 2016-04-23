package com.cybervisiontech.mapr.qa.CarWashHomework;

import java.io.*;

/**
 * Created by anna on 06.04.16.
 */
public abstract class Car implements Washable, Serializable {

    public static void main(String[] args) {
        save("D:\\serCar.dat");
        Car mySerCar = readObject("D:\\serCar.dat");
        System.out.println(mySerCar.toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNumber=" + carNumber +
                ", wheelsNumber=" + wheelsNumber +
                '}';
    }

    public int carNumber;
    public int wheelsNumber;

    public Car(int carNumber, int wheelsNumber) {
        this.carNumber = carNumber;
        this.wheelsNumber = wheelsNumber;
    }

    public void changeWheel(int wheelsNumber){
        this.wheelsNumber = wheelsNumber;
        String className = this.getClass().getName();
        System.out.println(className);
        System.out.println("Number of wheels: " + wheelsNumber);
    }

    public static void save(String filename){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(new ElectroCar(25567, 4));
        } catch (FileNotFoundException fnfe){
            System.err.println("File not found");
        } catch (IOException ioe){
            System.err.println("IOException");
        }
    }

    public static Car readObject(String filepath){
        Car c = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath))){
            Object o = ois.readObject();
            if (o instanceof Car){
                c = (Car) o;
            }
        } catch (FileNotFoundException fnfe){

        } catch (IOException ioe){

        }catch (ClassNotFoundException cnfe){

        }
        return c;
    }

}
