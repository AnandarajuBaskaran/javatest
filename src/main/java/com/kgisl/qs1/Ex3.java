package com.kgisl.qs1;

import java.util.*;

/**
 * Ex3
 */
public class Ex3 {

    public static void main(String[] args) {
        
System.out.println("Please Enter The First Name:");

Scanner scan = new Scanner(System.in);

String fn= scan.nextLine();

System.out.println("Please Enter The Second Name:");

String ln=scan.nextLine();

System.out.println("The Full Name is:"+fn.concat(ln));

System.out.println("The  First Name has "+fn.length()+" Charactor");

System.out.println("The Last Name has "+ln.length()+"charactor");

System.out.println("Enter Your Speed in MPh:");

int mph = scan.nextInt();

System.out.println("Enter Your Speed in miles :");

int miles = scan.nextInt();
    
int time;

System.out.println("At" +mph+ ", it will take" +(time = mph/miles)+ "hour to travel" +miles+ "miles");

}
}

//time = distance/speed