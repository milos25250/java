package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	    boolean quit = false;
	    int choice = 0;
	    printInstructions();
	    while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                     processArrayList();
                     break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print options");
        System.out.println("\t 1 - To print the list of items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item on the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for the item on the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem() {
        System.out.print("Enter the name for the item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item name to modify: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchItem() {
        System.out.print("Enter search item name: ");
        String item = scanner.nextLine();
        if (groceryList.onFile(item))
            System.out.println("Found " + item + " on the list");
        else System.out.println(item + " not found");
    }

    public static void processArrayList() {
//      both newArray and nextArray variables have the same functionality, the only difference is
//      that the newArray is initialized empty, then populated,
//      while the nextArray gets initialized upon declaration
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

//      converting an ArrayList back to an Array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
