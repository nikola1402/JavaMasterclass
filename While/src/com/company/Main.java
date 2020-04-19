package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;

        while(count != 5){
            System.out.println("Count value is "+count);
            count++;
        }

        for(count = 1; count < 5; count++){
            System.out.println("Second count value is " + count);
        }

        count = 1;
        while(true){
            if(count == 5){
                break;
            }
            System.out.println("Third count value is " +count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " +count);
            count++;
        } while (count !=5);


        // TEST QUIZ
        System.out.println("****TEST QUIZ****");

        int num = 0;
        int even = 0;
        while (num < 23) {
            if (isEvenNumber(num)) {
                System.out.println(num + " is an even number!");
                even++;
                if(even == 5)
                    break;
            }
            num++;
        }
        System.out.println("Total even numbers: " +even);
    }

    public static boolean isEvenNumber(int number){

        if(number%2==0 && number != 0){
            return true;
        }
        return false;

    }
}
