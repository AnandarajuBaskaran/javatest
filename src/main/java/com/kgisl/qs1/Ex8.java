package com.kgisl.qs1;

import java.util.*;

/**
 * Ex8
 */
public class Ex8 {

    {

        System.out.println("I am a default");
    }
    public Ex8(){
        System.out.println("I am a constructor");
    }

    static{

        System.out.println("I am the static");


    }
    

    public static void main(String[] args) {
        
        Ex8 obj = new Ex8();
        

    }

}