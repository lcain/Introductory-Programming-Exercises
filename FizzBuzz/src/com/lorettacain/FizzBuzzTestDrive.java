package com.lorettacain;

class FizzBuzz {
    private int number;
    private int three = 3;
    private int five = 5;
    private int result;
    private int counter;

    void setNumber(int n){
        number = n;
    }
    boolean isDivisibleByThree(){
        result = counter % three;
        if(result == 0){
            return true;
        } else{
            return false;
        }
    }
    boolean isDivisibleByFive(){
        result = counter % five;
        if(result == 0){
            return true;
        } else{
            return false;
        }
    }
    void FizzBuzz(){
        for (int i = 1; i <= number; i++){
            counter = i;
            if (isDivisibleByThree() && isDivisibleByFive()){
                System.out.println("FizzBuzz");
            } else if (isDivisibleByThree()){
                System.out.println("Fizz");
            } else if (isDivisibleByFive()){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

class FizzBuzzTestDrive{
    public static void main(String[] args){
        FizzBuzz testOneHundred = new FizzBuzz();
        testOneHundred.setNumber(100);
        testOneHundred.FizzBuzz();
    }
}