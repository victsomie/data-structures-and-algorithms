package com.company;


/*
*
* This algorithm will first find the smallest element in the array and
* swap it with the element in the first position,
* THEN it will find the second smallest element and
* swap it with the element in the second position,
* and it will keep on doing this until the entire array is sorted.
*
* */
public class SelectionSort {

    // Swap the two indexes
    private void swap(int theArray[], int biggerIndex, int smallerIndex) {
        int temp;
        temp = theArray[biggerIndex];
        // System.out.println("Before swap big:" + theArray[biggerIndex] + " Smaller: " + theArray[smallerIndex]);
        theArray[biggerIndex] = theArray[smallerIndex];
        theArray[smallerIndex] = temp;

        // System.out.println("Swapped big:" + theArray[biggerIndex] + " Smaller: " + theArray[smallerIndex]);
    }

    // Get the index of the item to swap
    private int indexOfMinimum(int theArray[], int startIndex, int theArrayLength) {

        int minimumValue = theArray[startIndex];
        int minimimIndex = startIndex;

        // Remember to start from the second index
        for (int i = minimimIndex + 1; i < theArrayLength; i++) {
            if (theArray[i] < minimumValue) {
                minimimIndex = i;
                minimumValue = theArray[i];
                // System.out.println("The minimum index is : " + minimimIndex + " Value: " +theArray[i]);
                //break;
            }
        }
        return minimimIndex;
    }


    void selectionSort(int[] theArray, int lengthOfArray) {

        for (int i = 0; i < lengthOfArray; i++) {
            int index = indexOfMinimum(theArray, i, lengthOfArray);
            swap(theArray, i, index);
        }
    }
}
