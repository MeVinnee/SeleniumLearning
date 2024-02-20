package org.example;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class PracticePage1 {
    public static void main (String [] args ){

        // If else condition.
        //check if array has multiple of 2
        //int[] arr1 = {1, 2, 3, 4, 5, 6, 12, 14, 16, 17};
        int[] arr1 = {1, 3, 5, 17};

        for ( int i=0; i<arr1.length; i++){

            if (arr1[i] %2 == 0){
                System.out.println(arr1[i]);
            }
            else {
                System.out.println(arr1[i]);
            }
        }

        //Used ArrayList
        ArrayList< String > a = new ArrayList<String>();
        a.add("Vanita");
        a.add("Ajit");
        a.add("Anvi");
        a.add("Ayansh");

        System.out.println(a.get(3));

        System.out.println("*******************");

        //Used Forloop type1
        for (int i =0; i<a.size(); i++){

           System.out.println(a.get(i));

        }
        System.out.println("*******************");

        //Used Forloop type2
        for( String val :a){
            System.out.println(val);
        }
    }

}
