package com.kgisl.qs1;

import java.util.*;

/**
 * Ex9
 */
public class Ex9 {

    public static void main(String[] args) {
        
ArrayList<Streamss> emp = new ArrayList<Streamss>();

emp.add(new Streamss(105, "Anand", "cs", 10000));
emp.add(new Streamss(102, "Raju", "it", 10000));
emp.add(new Streamss(105, "Gk", "cse", 15000));
emp.add(new Streamss(105, "Sasi", "cs", 14000));
    
double ts = emp.stream().mapToDouble(Streamss::getSalary).sum();
    System.out.println(ts);






}


}