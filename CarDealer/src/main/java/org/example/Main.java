package org.example;

import java.util.Scanner;

import static org.example.DataModel.Dealership.*;
import static org.example.DealershipFileManagers.DealershipFileManager.writeAllToFile;
import static org.example.userInterface.UserInterface.homeScreen;
import static org.example.userInterface.UserInterface.inventorySearch;

public class Main {


    public static void main(String[] args) {
        writeAllToFile();
        Scanner scanner = new Scanner(System.in);
        homeScreen();
        int userChoice = scanner.nextInt();
        switch(userChoice){
            case 1:
                inventorySearch(scanner);
                break;
            case 2:
                addVehicle();
                break;
            case 3:
            removeVehicle();
            break;
            case 4:
            break;
        }

    }




}