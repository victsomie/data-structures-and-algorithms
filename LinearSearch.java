package com.company;

public class LinearSearch {

    int linearSearch(int theArray[], int theLength, int searchItem) {

        int steps = 0;
        for (int item : theArray) {
            steps++;
            if (item == searchItem){
                System.out.println("Linear Search loops " + steps);
                return item;
            }
        }

        return -1;
    }

}
