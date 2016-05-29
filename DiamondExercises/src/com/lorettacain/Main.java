package com.lorettacain;

public class Main {

    public static void main(String[] args) {
	    isosceles(5);
        diamond(6);
        namedDiamond(5, "Loretta");
    }

    public static void isosceles(int lines){
        String asterisk = "*";
        String space = "";
        System.out.println("This is an isosceles triangle:");

        for (int i = 1; i < lines; i++){
            space += " ";
        }

        for (int i = 1; i < lines; i++) {
            space = space.substring(0, space.length()-1);
            System.out.println(space + asterisk);
            asterisk += "**";
        }

    }

    public static void diamond(int lines) {

        String asterisk1 = "*";
        String space1 = "";
        System.out.println("This is a diamond:");

        for (int i = 0; i < lines; i++){
            space1 += " ";
        }

        for (int i = 0; i < lines; i++) {
            space1 = space1.substring(0, space1.length()-1);
            System.out.println(space1 + asterisk1);
            asterisk1 += "**";
        }
        for (int i = 1; i < lines; i++) {
            if(i == 1 ) {
                asterisk1 = asterisk1.substring(0, asterisk1.length() - 2);
                space1 += " ";
            }
            asterisk1 = asterisk1.substring(0, asterisk1.length()-2);
            System.out.println(space1 + asterisk1);
            space1 += " ";
        }

    }

    public static void namedDiamond(int lines, String name){
        String asterisk1 = "*";
        String space1 = "";
        System.out.println("This is a named diamond:");

        for (int i = 0; i < lines; i++){
            space1 += " ";
        }

        for (int i = 1; i <= lines; i++) {
            if (i == lines){
                System.out.println(name);
            }
            else {

                space1 = space1.substring(0, space1.length() - 1);
                System.out.println(space1 + asterisk1);
                asterisk1 += "**";

            }

        }
        for (int i = 1; i < lines; i++) {

            asterisk1 = asterisk1.substring(0, asterisk1.length()-2);
            System.out.println(space1 + asterisk1);
            space1 += " ";
        }
    }
}
