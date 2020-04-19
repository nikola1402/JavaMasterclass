package com.company;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if(value ==1)
            System.out.println("Value was 1");
        else if (value ==2)
            System.out.println("Value was 2");
        else
            System.out.println("Was not 1 or 2");

        int switchValue = 2;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Was a 3, 4 or 5");
                break;
            default:
                System.out.println("Was above 5");
                break;
        }

        // TEST QUIZ

        char ch = 'F';
        switch(ch){
            case 'A':
                System.out.println("Char is 'A'");
                break;
            case 'B':
                System.out.println("Char is 'B'");
                break;
            case 'C':
                System.out.println("Char is 'C'");
                break;
            case 'D':
                System.out.println("Char is 'D'");
                break;
            case 'E':
                System.out.println("Char is 'E'");
                break;
            default:
                System.out.println("Value not correct!");
        }

        String str = "January";
        switch(str.toLowerCase()){
            case "january":
                System.out.println("Month is January");
                break;
            case "february":
                System.out.println("Month is February");
                break;
            case "march":
                System.out.println("Month is March");
                break;
            default:
                System.out.println("Month above march");
        }


    }
}
