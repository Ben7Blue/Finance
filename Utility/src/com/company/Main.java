package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void Calculation(){

    }

    public static void main(String[] args) {
        //This Method is for Initialization and Final Product

        /*Get Inputs
            Total Number of Tenants
            Total Bill
            Total Days of Service
         */
        int Tenants;
        double TotalDays;
        double Bill;
        Scanner scanner = new Scanner(System.in);


        //Create HashMap for Names with Key of 0 to Max number of Tenants
            //<Number, Tenant's Name>
        HashMap<Integer, String> Names = new HashMap<Integer, String>();
            //At first, I planned on using an iterator to traverse the HashMap and get each Tenants
            //for the Final payment outline but I realize that I can simply use
            //data from Tenants. Example: 0, 1, 2, 3, 4 ,5

        //Create HashMap for the Names and their Days used for utility
            //<Name, Number of Days>
        HashMap<String, Integer> Used = new HashMap<String, Integer>();


        System.out.println("Welcome to the Utility Distribution Program!\n");
        System.out.println("Now, input the data for calculation:\n\n");


        System.out.print("Total Bill: ");
        Bill = scanner.nextDouble();


        System.out.print("Total Days of Service: ");
        TotalDays = scanner.nextInt();

        System.out.print("Total Number of Tenants: ");
            //If I were to use names and other details, I would need Objects.
            //If I were to made this program save tenants, I would need a database.
            //Since this is a one time use. I would add as much random features for experience.
        Tenants = scanner.nextInt();
        scanner.nextLine();

        //Get Each Tenants Name
        for (int i = 0; i < Tenants; i++){
            System.out.print("What is the name of Tenant Number " + (i+1) +  "?: ");
            String Name = scanner.nextLine();
            Names.put(i, Name);

            //Get Total Number of Days Used
            System.out.print("How many days has " + Names.get(i) + " used it?: ");
            int Use = scanner.nextInt();
            scanner.nextLine();
            Used.put(Names.get(i), Use);

        }

        //Start Calculation in Different Methods
            //Actually Start Coding it after you get the program working correctly.
            //so that you know all the details and aspects that you need.

        //Total Percentage is the Sum of all of DaysUsed/TotalDays for each Tenant
        double TotalPercentage = 0;

        //Each Tenant will have their own percentage of the entire price
        HashMap<String, Double> Percentage = new HashMap<String, Double>();

        for (int i = 0; i < Tenants; i++){
            double p = (Used.get(Names.get(i)))/TotalDays;

            Percentage.put(Names.get(i), p);

            TotalPercentage = TotalPercentage + p;
        }

        //Payment for each Tenants HashMap
        HashMap<String, Double> Payment = new HashMap<String, Double>();

        for (int i = 0; i < Tenants; i++){
            double placeholder = Percentage.get(Names.get(i))/TotalPercentage * Bill;

            Payment.put(Names.get(i), placeholder);
        }


        System.out.print("\n\n");
        System.out.println("=============================================================");
        System.out.println("*                                                           *");
        System.out.println("*                          Payment                          *");
        System.out.println("*                                                           *");
        System.out.println("=============================================================\n20");

        for(int i = 0; i < Tenants; i++){
            System.out.println("Tenant " + (i+1) + ": " + Names.get(i) + "\t≈    $" + Payment.get(Names.get(i)));
        }

    }
}
