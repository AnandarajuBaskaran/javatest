package com.kgisl.qs1;
import java.util.*;

/**
 * Ex5
 */
public class Ex5 {

    public static void main(String[] args) {
        
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Anand");
        arr.add("Gk");
        arr.add("sasi");
        arr.add("Anand");

        System.out.println("The List with duplicate"+ arr);
        ArrayList<String> arr1 = new ArrayList<String>();

        Iterator<String> duplicate = arr.iterator();

        while(duplicate.hasNext())
        {
        String dupWord = duplicate.next();
        if(arr1.contains(dupWord))
        {
            duplicate.remove();
        }else
        {
            arr1.add(dupWord);
        }
        }
      System.out.println("The non duplicate array list is :"+arr1);


    }
}