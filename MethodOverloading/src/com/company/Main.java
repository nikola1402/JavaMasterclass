package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " +newScore);
        calculateScore(300);
        calculateScore();

        // QUIZ TEST
        double cm = calcFeetAndInchesToCentimeter(157);
        System.out.println("Result is: " +cm);
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " +playerName+ " scored " +score+ " points");
        return score*1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Player scored " +score+ " points");
        return score*1000;
    }

    public static int calculateScore () {
        System.out.println("No player scored");
        return 0;
    }

    // TEST QUIZ

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if((feet >= 0) || ((0 <= inches) && (inches <= 12d))){
            double cm = (feet*12 + inches)*2.54d;
            return cm;
        } else
            return -1;
    }

    public static double calcFeetAndInchesToCentimeter(double inches){

        if(inches >= 0){

            double inchesRemaining = inches % 12;
            double feet = (inches - inchesRemaining) / 12;
            double cm = calcFeetAndInchesToCentimeters(feet, inchesRemaining);
            return cm;
        } else
            return -1;

    }

}
