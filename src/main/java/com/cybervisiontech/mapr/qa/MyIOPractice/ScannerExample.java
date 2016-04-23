package com.cybervisiontech.mapr.qa.MyIOPractice;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Анна on 23.04.2016.
 */
public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.println();
        System.out.println("What is your name?");
        while (scanner.hasNext()){
            s = scanner.next();
            System.out.println("Hello " + s);
        }

    }
}
