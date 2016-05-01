package com.cybervisiontech.mapr.qa.MyIOPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Анна on 01.05.2016.
 */
public class WordsCounter {

    // The method counts the quantity of words in file
    public static int getWordsCount(String filepath){
        int countWords = 0;
        try (Scanner scanner = new Scanner(new FileInputStream(filepath))){
            countWords = countWordsInAllLines(countWords, scanner);
        } catch (FileNotFoundException fnfe){
            System.err.println("The file is not found");
        }
        return countWords;
    }

    // The method divides file on lines and counts words in each separate line
    private static int countWordsInAllLines(int countWords, Scanner scanner) {
        while (scanner.hasNextLine()){
            String oneLine = scanner.nextLine();
            countWords = countWordsInOneLine(countWords, oneLine);
        }
        return countWords;
    }

    // The method counts the quantity of words in one line
    private static int countWordsInOneLine(int countWords, String oneLine) {
        StringTokenizer token = new StringTokenizer(oneLine, " \t\n\r,:-/()");
        while (token.hasMoreTokens()){
            token.nextToken();
            countWords++;
        }
        return countWords;
    }


    //Verification
    public static void main(String[] args) {
        System.out.println(getWordsCount("D:\\poetry.txt"));
    }
}
