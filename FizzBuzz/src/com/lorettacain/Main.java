package com.lorettacain;

public class Main {

    public static void main(String[] args) {
	    FizzBuzz(100);
    }

    public static void FizzBuzz(int number){
        for (int i = 1; i <= number; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            if (i % 3 == 0){
                System.out.println("Fizz");
            }
            if (i % 5 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    }
}
