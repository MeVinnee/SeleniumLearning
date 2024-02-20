package org.example;

import java.util.ArrayList;

public class PracticePage2 {
        public static void main (String [] args){

        ArrayList< String > a = new ArrayList<String>();
        a.add("Vanita");
        a.add("Ajit");
        a.add("Anvi");
        a.add("Ayansh");

        //String a = new String("Welcome");

        String s1 = "Vanita Ajit Anvi";
        String[] SplitedString = s1.split("Ajit");
        System.out.println(SplitedString[0]);
        System.out.println(SplitedString[1]);
        System.out.println(SplitedString[1].trim());

        for(int i= s1.length()-1; i>0 ; i--){
            System.out.println(s1.charAt(i));
        }

    }

}
