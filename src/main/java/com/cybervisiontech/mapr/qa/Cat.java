package com.cybervisiontech.mapr.qa;

/**
 * Created by Анна on 16.04.2016.
 */
public class Cat extends Animal implements Petable{

    public static void testClassMetod(){
        System.out.println("The class metod is Cat");
    }

    @Override
    public void testInstanceMethod(){
        System.out.println("The instance method is Cat");
    }

    public void eat(){
        System.out.println("Eat");
    }


    @Override
    public void pet() {
        System.out.println("meow-meow");
    }
}
