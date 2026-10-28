package com.pluralsight;

import java.util.Scanner;


public class FullNameApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName;
        String middleInitial;
        String lastName;
        String suffix;
        String fullName;

        //Asking for input
        System.out.print("Please enter your first name: ");
        firstName = sc.nextLine().trim();

        System.out.print("Please enter your middle initial: ");
        middleInitial = sc.nextLine().trim();

        System.out.print("Please enter your last name: ");
        lastName = sc.nextLine().trim();

        System.out.print("Please enter your suffix: ");
        suffix = sc.nextLine().trim();

        //adding firstName;
        fullName = firstName;

        //Calling addMiddleName method
        if (!middleInitial.isBlank()){
            fullName = addMiddleInitial(middleInitial, fullName);
        }



        //adding last name after middle
        fullName += " " + lastName;


        //if we get a suffix we add it to the fullName
        if (!suffix.isBlank()) {
            fullName = addSuffix(suffix, fullName);
        }

        //output
        System.out.println(fullName);

    }

    //Method to check if middle is necesary
    public static String addMiddleInitial(String middleInitial, String fullName) {
        if(!middleInitial.isBlank()){
            fullName += " "  + middleInitial.charAt(0) + ".";
            return fullName;
        }
        return fullName;
    }

    //Looking if we need a suffix
    public static String addSuffix(String suffix, String fullName) {
        if (!suffix.isBlank()) {
            fullName += ", " + suffix.trim();
        }
        return fullName;
    }

}
