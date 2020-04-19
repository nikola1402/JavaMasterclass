package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] list = getIntegers(5);
        printArray(list);
        list = sortIntegers(list);
        System.out.println("\nSorted:");
        printArray(list);


    }

    public static int[] getIntegers(int length){
        int[] list = new int[length];

        for(int i = 0; i<length; i++){
            System.out.println("Type a number: \r");
            list[i] = scanner.nextInt();
        }
        return list;
    }

    public static void printArray(int[] list){
        for(int i=0; i<list.length; i++){
            System.out.println("Number #"+i+" is " +list[i]);
        }
    }

    public static int[] sortIntegers(int[] list){

        int[] sortedArray = new int[list.length];
        for(int i=0; i<list.length; i++){
            sortedArray[i] = list[i];
        }

        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for (int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] > sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
