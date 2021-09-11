/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;
import java.util.Date;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "What is your current age? " );
        String myAge = scnN.next();
        int crntAge1 = Integer.parseInt(myAge);
        System.out.print( "At what age would you like to retire? " );
        String newAge = scnN.next();
        int retireAge = Integer.parseInt(newAge);
        System.out.println( "You have "+ (retireAge-crntAge1) +" years left until you can retire.");
        Date year = new Date();
        int yearnum = year.getYear()+1900;
        System.out.print( "It's "+ yearnum +", so you can retire in "+ (yearnum+(retireAge-crntAge1)) + ".");
    }
}
