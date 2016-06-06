package com.lorettacain;

import java.util.ArrayList;
import java.util.List;

class PrimeFactors {
    private int number;

    void setNumber(int n){
        number = n;
    }
    List<Integer> generateArrayOfPrimes() {
        List<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 2; i <= number / i; i++) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }
        if (number > 1) {
            primeFactors.add(number);
        }
        System.out.println(primeFactors);
        return primeFactors;
    }
}
class PrimeFactorTestDrive{
    public static void main(String[] args) {
        PrimeFactors testOne = new PrimeFactors();
        testOne.setNumber(1);
        testOne.generateArrayOfPrimes();

        PrimeFactors testThirty = new PrimeFactors();
        testThirty.setNumber(30);
        testThirty.generateArrayOfPrimes();

        PrimeFactors testFifty = new PrimeFactors();
        testFifty.setNumber(50);
        testFifty.generateArrayOfPrimes();

        PrimeFactors testOneHundred = new PrimeFactors();
        testOneHundred.setNumber(100);
        testOneHundred.generateArrayOfPrimes();
    }
}


//    Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.
//
//        For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.