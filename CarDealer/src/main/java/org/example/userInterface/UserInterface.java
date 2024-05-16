package org.example.userInterface;

import java.util.Scanner;

import static org.example.DataModel.Dealership.*;
import static org.example.DataModel.Dealership.listAllVehicles;

public class UserInterface {
    public static void inventorySearch(Scanner scanner) {
        System.out.printf("""
             How would you like to search? 
            1. Price Range 
            2. Make and Model  
            3. Year 
            4. Color 
            5. Mileage Range 
            6. Type (SUV, SEDAN, HATCHBACK, COUPE) 
            7. List All 
             """);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                getVehicleByPrice();
                break;
            case 2:
                getVehicleByMakeAndModel();
                break;
            case 3:
                getVehicleByYear();
                break;
            case 4:
                getVehicleByColor();
                break;
            case 5:
                getVehicleByMileage();
                break;
            case 6:
                getVehicleByType();
                break;
            case 7:
                listAllVehicles();
        }
    }
     public static void homeScreen() {
        System.out.printf("""
                Welcome to %s , %s %s 
                Please choose of of the following: 
                1. Inventory Search 
                2. Add Vehicle 
                3. Remove vehicle from inventory 
                """, TITLE, ADDRESS, PHONE_NUMBER ) ;
    }
}

