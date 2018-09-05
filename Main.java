package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This is awesome");
        //System.out.println(20);

        BinarySearch binarySearch = new BinarySearch();
        LinearSearch linearSearch = new LinearSearch();


        //int values[] = {13, 21, 54, 81, 76, 7,  90, 45};
        int values[] = {8, 13, 8,7, 5, 5, 6, 6, 7, 8, 81};
        int[] array = new int[100000];

        Random random = new Random();

        //int values[] = random.ints(100, 10,100).toArray();

        for (int i : values){
            System.out.println(i);
        }

        int n = values.length;
        int target = 81;
        System.out.println("Binary Search > " + binarySearch.binarySearch(values, n, target));
        System.out.println("Linear Search > " + linearSearch.linearSearch(values, n, target));


    }


}