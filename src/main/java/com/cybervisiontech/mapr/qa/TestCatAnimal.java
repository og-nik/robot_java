package com.cybervisiontech.mapr.qa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Анна on 16.04.2016.
 */
public class TestCatAnimal {

    public static void main(String[] args) {

        Animal a1 = new Cat();
        Animal a2 = new Cat();
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Worm w1 = new Worm();
        Toy t1 = new Toy();

        Animal[] arrAnimal = new Animal[4];
        Petable[] arrPets = new Petable[5];
        List<Petable> petsList = new ArrayList<Petable>();

        petsList.add(0,c1);
        petsList.add(1,c2);
        petsList.add(2,t1);

        System.out.println("My ArrayList:");
        Iterator<Petable> iterator = petsList.iterator();

        while(iterator.hasNext()){
            Petable nextPet = iterator.next();
            if (nextPet.getClass() != Cat.class){
                iterator.remove();
            }
        }



/**
        arrPets[0] = c1;
        arrPets[1] = c2;
        arrPets[2] = t1;


        for (int i = 0; i < arrPets.length; i++){
            arrPets[i].pet();
        }




        arrAnimal[0] = a1;
        arrAnimal[1] = a2;
        arrAnimal[2] = c1;
        arrAnimal[3] = c2;

        for (int i = 0; i < arrAnimal.length; i++){
            arrAnimal[i].testInstanceMethod();
        }

/**
        a1.testInstanceMethod();
        a2.testInstanceMethod();
        c1.testInstanceMethod();
        System.out.println();

        a1.testClassMetod();
        a2.testClassMetod();
        c1.testClassMetod();
 */



    }
}
