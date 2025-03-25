package com.Venkat.tdd;

public class Fizzbuzz {

    public static String compute(int i) {
        StringBuilder res = new StringBuilder();
        if (i % 3 == 0) {
            res.append("Fizz");
        }
        if (i % 5 == 0) {
            res.append("Buzz");
        }
        if(res.length() == 0){
            res.append(i);
        }
        return res.toString();
    }
}
//        if(i%3 == 0 && i%5 ==0){
//            return "FizzBuzz";
//        }else if(i %3 == 0){
//            return "Fizz";
//        }else if(i%5 == 0){
//            return "Buzz";
//        }
//        return Integer.toString(i);
//    }

