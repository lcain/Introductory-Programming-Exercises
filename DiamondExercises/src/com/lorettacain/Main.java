package com.lorettacain;

public class Main {

    public static void main(String[] args) {
	    isosceles(5);
        diamond(5);
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

        String asterisk = "*";
        String space = "";
        System.out.println("This is a diamond:");

        for (int i = 1; i < lines; i++){
            space += " ";
        }

        for (int i = 1; i < lines; i++) {
            space = space.substring(0, space.length()-1);
            System.out.println(space + asterisk);
            asterisk += "**";
        }
        for (int i = 1; i < lines; i++) {
            asterisk = asterisk.substring(0, asterisk.length()-2);
            System.out.println(space + asterisk);
            space += " ";
        }

    }
}
