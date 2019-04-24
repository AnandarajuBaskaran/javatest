package com.kgisl.qs1;

import java.util.*;


/**
 * Ex14
 */
public class Ex14 {

    public static void main(String[] args) {
        String str="comma separated String";
ArrayList aList= new ArrayList(Arrays.asList(str.split(",")));
for(int i=0;i<aList.size();i++)
{
    System.out.println(aList.get(i));
}


    }
}