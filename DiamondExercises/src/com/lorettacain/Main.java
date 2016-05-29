package com.lorettacain;

public class Main {

    public static void main(String[] args) {
	    isosceles(5);
    }

    public static void isosceles(int lines){
        String asterisk = "*";
        String space = "";
        System.out.println("This is an isosceles triangle:");

        for (int i = 0; i < lines; i++){
            space += " ";
        }

        for (int i = 1; i < lines; i++) {
            space = space.substring(0, space.length()-1);
            System.out.println(space + asterisk);
            asterisk += "**";
        }

    }
}
