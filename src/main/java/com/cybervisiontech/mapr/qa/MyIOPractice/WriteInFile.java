package com.cybervisiontech.mapr.qa.MyIOPractice;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

/**
 * Created by Анна on 23.04.2016.
 */
public class WriteInFile {

    public static void main(String[] args) throws IOException {
/**
        WriteInFile test = new WriteInFile();
        //test.writePid("D:\\newfile1.pid");

        Path p = Paths.get("D:\\newfile1.pid");
        System.out.println(p.toAbsolutePath());
 */

        File f = new File("D:\\newfile1.pid");

        if (f.exists() && f.canRead()){
            if (f.canWrite()) {
                BufferedReader bf = new BufferedReader(new FileReader(f));
                FileWriter fw = new FileWriter("D:\\newfile1.pid", true);
                PrintWriter pw = new PrintWriter(fw);
                Random random = new Random();
                pw.write(String.valueOf(random.nextInt(65535)) + "\n");
                System.out.println();
                pw.close();
            }

        }
    }
/**
    public void writePid(String filename){
        try (PrintStream outF = new PrintStream(filename);){
            outF.println(new Random().nextInt(65535));
        }catch (FileNotFoundException e){
            System.err.println("File not found");
        }
    }
 */
}
