package com.company;

public class Main {

    public static void main(String[] args) {

        // Ovo je deo za testiranje


    }

    private void IfKeywordAndCodeBlocks(){

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000) {
            System.out.println("Score is less than 5000 and greater than 1000");
        } else if(score < 1000) {
            System.out.println("Score is less than 1000");
        } else {
            System.out.println("Got to the 'else' statement");
        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " +finalScore);
        }
    }

    private void StatementsWhiteSpaceAndIndenting() {

        // Expression + ostatak linije, odnosno puna ispisana linija je Statement

        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        System.out.println("this" +
            "is" +
            "another statement");

    }

    private void KeywordsAndExpressions() {

        // Expression je sve ono sto korisnik unese samostalno a da nije rezervisana rec
        // Keyword: double
        // Expression: km = (100 * 1.609344);

        // a mile is equal to 1.609344 km

        double km = (100 * 1.609344);

        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }
    }

    private void Operators() {

        int result = 1+2;
        System.out.println("1 + 2 = " +result);

        int previousResult = result;

        result = result-1;
        System.out.println(previousResult + " - 1 = " +result);

        previousResult = result;

        result = result*10;
        System.out.println(previousResult + " * 10 = " +result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result = result +1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);
        result += 2;
        System.out.println("Result is now " + result);
        result -= 3;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);


        boolean isAlien = false;

        if (isAlien == false)
            System.out.println("It is not an alien");

        if (!isAlien)
            System.out.println("It is not an alien");


        int topScore = 95;
        if (topScore == 100)
            System.out.println("You got the high score!");

        int currentTopScore = 91;
        if ((topScore > currentTopScore) && (topScore < 100))
            System.out.println("Greater than current top score and less than maximum score");

        if((topScore > 90) || (currentTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = true;

        if(!isCar)
            System.out.println("This is not a car");

        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is True, " +wasCar);


        // TEST QUIZ

        double db1 = 20d;
        double db2 = 80d;
        double db3 = 25 * (db1 + db2);
        double db4 = db3 % 40;

        if(db4 <= 20)
            System.out.println("Total was over the limit >>> " +db4);
    }


    private void Strings() {

        String myString = "This is a string";
        System.out.println("Jedan: " +myString);

        String numberString = "59.95";
        numberString = numberString + "49.95";
        System.out.println("Dva: " +numberString);

        int myInt = 50;
        System.out.println("Tri: " +numberString+myInt);
    }


    private void FloatAndDouble() {

        int myInt = 5;
        float myFloat = 5f;
        double myDouble = 5d;

        System.out.println("myInt = " + myInt);
        System.out.println("myFloat = " +myFloat);
        System.out.println("myDouble = " +myDouble);

        // TEST QUIZ

        double pound = 200d;
        double poundsInKg = 0.45359237d;
        double convert = pound * poundsInKg;

        System.out.println("Total kg = " +convert);
    }

    private void CharAndBoolean () {

        // Char moze smestiti samo jedan simbol
        // Stampa Copyright simbol
        char myChar = '\u00A9';
        System.out.println(myChar);

        boolean myBoolean = true;
    }

    private void ByteShortInt() {
        // Koriscenjem odgovarajuceg tipa podataka se smanjuje zahtevnost aplikacije
        // Svaki od tipova rezervise odredjenu kolicinu memorije u sistemu

        // long has a width of 64
        long longMax = 9_223_372_036_854_775_807L;
        long longMin = -9_223_372_036_854_775_808L;

        // int has a width of 32
        int intMin = -2_147_483_648;
        int intMax = 2_147_483_647;

        // short has a width of 16
        short shortMin = -32768;
        short shortMax = 32767;

        // byte has a width of 8
        byte byteMin = -128;
        byte byteMax = 127;


        // TEST QUIZ

        byte bt = 13;
        short sh = 3000;
        int in = 13444;
        long lg = 50000L + 10L*(bt + sh + in);

        System.out.println(lg);
    }

}
