package org.example;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PracticePage {
     public static void main (String [] args) {

          int MyNum = 5;
          String MyName = "Vinnee";
          char letter = 'R';
          double Number = 3.4;
          float Number1 = 3;
          boolean MyCard = true;

         /*** System.out.println(MyNum);
          System.out.println(MyName);
          System.out.println(letter);
          System.out.println(Number);
          System.out.println(Number1);
          System.out.println(MyCard);**/

          //array
          int[] arr = new int[5];
          arr[0] = 1;
          arr[1] = 2;
          arr[2] = 3;
          arr[3] = 4;
          arr[4] = 5;

          int[] arr1 = {1, 2, 3, 4, 5, 6, 12, 14, 16, 17};

          System.out.println(arr1 [0]);

          //For Loop
          for(int i=0; i< arr.length; i++)
          {
              System.out.println(arr[i]);
          }

          for (int i= 0; i <arr1.length; i++)
          {
               System.out.println(arr1[i]);
          }

          String[] name = {"Vanita", "Ajit", "Anvi", "Ayansh"};

          for (int i= 0; i<name.length; i++)
          {
               System.out.println(name[i]);
          }

          for (  String s:name)
          {
               System.out.println(s);
          }
     }
}
