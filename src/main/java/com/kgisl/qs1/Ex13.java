package com.kgisl.qs1;

import java.util.*;

/**
 * Ex13
 */
public class Ex13 {

    public static void main(String[] args) {
        
     ArrayList<String> arr = new ArrayList<String>();
     arr.add("anand");
     arr.add("raju");
     arr.add("Sasi");
     arr.add("gk");
        System.out.println("The ArrayList is:"+arr);
     String [] arr1 = new String[arr.size()];
        arr1 = arr.toArray(arr1);
        for(String s : arr1){

            System.out.println(s);
        }

    }
}