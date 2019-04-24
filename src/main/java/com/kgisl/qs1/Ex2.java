package com.kgisl.qs1;

import java.io.*;
import java.util.*;

/**
 * Ex2
 */
public class Ex2 {
    public static void main(String[] args) {
        
        System.out.println("Enter the miles");

        Scanner s = new Scanner(System.in);

        int miles = s.nextInt();

        System.out.println(miles + " miles = " + milesTokm(miles) + " km");
 
        System.out.print("Enter the km:");
        int Km = s.nextInt();
 
        System.out.println(Km + " km = " + kmTomiles(Km) + " miles");
        s.close();



    }

    private static double milesTokm(int miles) {
        return miles * 1.609344;
    }

    private static double kmTomiles(int km) {

        return km * 0.621371;
    }

}