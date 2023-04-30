//Author: Teta K. Tucker//
// Project 6.3//
//Class Name:MultipleLeapYears//
//Modify the solution to the previous project so that the user can evaluate multiple years.// 
//Allow the user to terminate the program using an appropriate sentinel value.// 
//Validate each input value to ensure it is greater than or equal to 1582.//

import java.util.Scanner;

public class MultipleLeapYears
 {
         public static void main (String[] args)
         {
            Scanner leap = new Scanner(System.in);
            int year;
            
            System.out.println ("Enter the year (Must be after 1582):");
            year = leap.nextInt();
            
            while (year < 1582)
            {
               System.out.print("The year cannot be before 1582");
               year = leap.nextInt();
            }
            
            if (year % 400 == 0);
               {
                  System.out.println(year + " Leap year");   
               }
               
                  if (year % 4 == 0)
               {
                  System.out.println(year  + " Leap year");
               }
             
                else if (year % 100 != 0);
               {
                  System.out.println(year + " NOT a leap year");
               }
               
             
         }

 }