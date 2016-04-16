package com.cybervisiontech.mapr.qa;

/**
 * Created by Анна on 16.04.2016.
 */
public abstract class Animal {

    public static void testClassMetod(){
        System.out.println("The class metod is Animal");
    }

    public void testInstanceMethod(){
        System.out.println("The instance method is Animal");
    }

    protected abstract void eat();
}
