package com.company;

public class BinarySearch {

    /*
     *
     *
     * */
    int binarySearch(int theArray[], int theArrayLength, int searchItem) {

        int middleIndex;

        int steps = 0;

        int min = 0;
        int max = theArrayLength - 1;


        while (max >= min) {
            middleIndex = (max + min) / 2;

            steps++;
            if (theArray[middleIndex] == searchItem) {
                System.out.println("Number of steps >> " + steps);
                return theArray[middleIndex];
            } else if (theArray[middleIndex] > searchItem) {
                max = middleIndex - 1;
            } else {
                min = middleIndex + 1;
            }

        }

        System.out.println("Number of steps when searching non existing >> " + steps);
        return -1;
    }
}
