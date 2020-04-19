package com.company;

/**
 * Created by nikol on 21-Jan-18.
 */
public class Series {

    // Returns the sum of all numbers from 0 to n
    public int nSum(int n){
        int sum = 0;
        for(int i=0; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    // Returns the product of all numbers from 1 to n
    public int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    // Return the nth Fibonnaci number
    public int fibonnaci(int n){
        if( n==0 ){
            return 0;
        } else if( n==1){
            return 1;
        } else {
            return fibonnaci(n - 1 ) + fibonnaci(n - 2);
        }
    }


}
