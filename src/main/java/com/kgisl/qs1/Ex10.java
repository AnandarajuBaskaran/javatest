package com.kgisl.qs1;

import java.util.*;

public class Ex10 {

    public static void main(String[] args) {
        
        ArrayList<emp> arr = new ArrayList<emp>();

        arr.add(new emp(101, "Anand", 10000));
        arr.add(new emp(105, "raju", 15000));
        arr.add(new emp(100,"gk",11000));
        arr.add(new emp(99, "Sasi", 12000));
        Comparator<emp> c1=Comparator.comparing(emp::getid);  
        Collections.sort(arr,c1);  
           System.out.println("Sort by empid");  
           for(emp e: arr){  
             System.out.println(e.empid+" "+e.name+" "+e.Salary);  
             }   
        
        
        Comparator<emp> c=Comparator.comparing(emp::getName);  
   Collections.sort(arr,c);  
   System.out.println("Sort by Name");  
   for(emp e: arr){  
     System.out.println(e.empid+" "+e.name+" "+e.Salary);  
     }    
   Comparator<emp> c3 = Comparator.comparing(emp:: getSalary);
   Collections.sort(arr,c3);
   System.out.println("Sort by Salary");
   for(emp e :arr){

    System.out.println(e.empid+" "+e.name+" "+e.Salary);
   }

    }
}