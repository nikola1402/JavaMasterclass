package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int scored = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = calculateScore(gameOver, scored, levelCompleted, bonus);

        if (finalScore == -1)
            System.out.println("You have NOT finished the game");
         else
            System.out.println("You have finished the game with score of " +finalScore);

        finalScore = calculateScore(false, 10000, 8, 200);

        if (finalScore == -1)
            System.out.println("You have NOT finished the game");
        else
            System.out.println("You have finished the game with score of " +finalScore);



        // TEST QUIZ
        System.out.println("TEST QUIZ");

        String name = "Player 1";
        int score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        score = 900;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        score = 400;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

    }

    private static int calculateScore(boolean gameOver, int scored, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = scored + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else
            return -1;

    }

    // TEST QUIZ METHODS

    private static void displayHighScorePosition(String name, int position){

        System.out.println(name + " managed to get into position " +position);

    }

    private static int calculateHighScorePosition(int score){

        if(score >= 1000) {
            return 1;
        } else if((score >= 500) && (score < 1000)) {
            return 2;
        } else if((score >= 100) && (score < 500)) {
            return 3;
        } else
            return 4;

    }

}
