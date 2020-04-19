package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nikol on 03-Feb-18.
 */
public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i=1; i <=100; i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("Squares: " + squares.size());
        System.out.println("Cubes:" + cubes.size());

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union: " + union.size());

        Set<Integer> intersect = new HashSet<>(squares);
        intersect.retainAll(cubes);
        System.out.println("Intersection: " + intersect.size());
        for(int i : intersect){
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "One day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));
        for(String s: words){
            System.out.println(s);
        }



    }
}
