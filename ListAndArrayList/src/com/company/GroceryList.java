package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println(groceryList.size() + " item(s) on the list");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int pos = findItem(currentItem);

        if (pos >= 0)
            modifyGroceryItem(pos, newItem);
    }

    private void modifyGroceryItem(int position, String item) {
        groceryList.set(position, item);
        System.out.println("Item on position " + (position + 1)
                + " successfully modified, and now is " + item);
    }

    public void removeGroceryItem(String item) {
        int pos = findItem(item);

        if (pos >= 0)
            removeGroceryItem(pos);
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
        System.out.println("Item on position " + (position + 1)
                + " successfully removed");
    }

    private int findItem(String item) {
        return groceryList.indexOf(item);
    }

    public boolean onFile(String item) {
        int position = findItem(item);

        return position >= 0;
    }
}
