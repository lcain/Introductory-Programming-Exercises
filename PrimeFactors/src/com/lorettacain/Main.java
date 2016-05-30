package com.lorettacain;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        generate(1);
        generate(30);
        generate(50);
        generate(100);

    }

    public static List<Integer> generate(int n) {

        List<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            primeFactors.add(n);
        }
        System.out.println(primeFactors);
        return primeFactors;

    }

}

//    Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.
//
//        For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.