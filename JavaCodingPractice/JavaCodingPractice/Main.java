package JavaCodingPractice;

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        var obj = new MyThread();
        obj.start();


        obj.join();
        System.out.print("On Main Method");

        System.exit(0);
    }
}


class MyThread extends Thread {
    private static int[] resource = new int[10];

    

    public void run() {
       
    }
}