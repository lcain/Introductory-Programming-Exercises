package com.lorettacain;

public class Main {

    public static void main(String[] args) {

        singleAsterisk();
        vertical(4);
        horizontal(4);
        rightTriangle(4);

    }

    public static String singleAsterisk(){
        String asterisk = "*";
        System.out.println("This is a single asterisk:");
        System.out.println(asterisk);
        return asterisk;
    }

    public static void vertical(int number){
        String asterisk = "*";
        System.out.println("This is a vertical line:");
        for (int i = 0; i < number; i++) {
            System.out.println(asterisk);
        }
    }

    public static void horizontal(int number){
        String asterisk = "";
        System.out.println("This is a horizontal line:");
        for (int i = 0; i < number; i++) {
            asterisk += "*";
        }
        System.out.println(asterisk);

    }

    public static void rightTriangle(int number){
        String asterisk = "";
        System.out.println("This is a right triangle:");
        for (int i = 0; i < number; i++) {
            asterisk += "*";
            System.out.println(asterisk);
        }

    }


}
