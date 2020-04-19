package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nikol on 31-Jan-18.
 */
public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high-level, object-oriented, platform independant language");
        languages.put("Python", "an interpreted object oriented, high level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("Basic", "beginners all purpose symbolic instruction code");
        languages.put("Lisp", "therein lies madness");

        System.out.println(languages.get("Java"));

        languages.put("Java", "this course is about Java");
        System.out.println(languages.get("Java"));

        System.out.println("************************************************************");



        //languages.remove("Lisp");
        if(languages.remove("Algol", "an algorithmic language")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key value pair not found");
        }

        System.out.println(languages.replace("Lisp", "a funct prog lang"));
        System.out.println(languages.replace("Scala", "this will not be added9"));

        for(String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

    }

}
