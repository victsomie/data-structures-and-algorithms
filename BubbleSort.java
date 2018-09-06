package com.company;

/*
 * Sorting takes place by stepping through all the elements one-by-one and
 * comparing it with the adjacent element and
 * swapping them if required.
 *
 * */
public class BubbleSort {

    int[] bubbleSort(int[] theArray, int arraySize) {


        int i, j, tempBiggerNumber;
        int flag = 0;
        int loopNumber = 0;
        int loopMainNumber = 0;
        for (i = 0; i < arraySize; i++) {

            System.out.println("----- Outer Loop main step:" + loopMainNumber);
            loopMainNumber++;
            for (j = 0; j < arraySize - i - 1; j++) {

                System.out.println("Inner loop count: " + loopNumber);
                loopNumber++;
                if (theArray[j] > theArray[j + 1]) {

                    // Swap the numbers here
                    tempBiggerNumber = theArray[j]; // We store in different variable while swapping
                    //System.out.println("Bigger number  " + tempBiggerNumber);
                    //System.out.println("Smaller number  " + theArray[i + 1]);
                    theArray[j] = theArray[j + 1];
                    theArray[j + 1] = tempBiggerNumber;

                    // Add a flag after swapping
                    flag=1;
                }
            }

            if (flag == 0){
                break;
            }
        }


        printTheArray(theArray);
        return theArray;
    }

    private void printTheArray(int[] arrayToPrint) {
        for (int number : arrayToPrint) {
            System.out.print(number + ", ");
        }
    }
}
