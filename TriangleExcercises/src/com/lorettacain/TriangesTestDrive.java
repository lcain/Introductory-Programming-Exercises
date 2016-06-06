package com.lorettacain;

class Triangles{

    private int number;
    private String asterisk = "*";

    void setNumber(int n){
        number = n;
    }
    void printAnAstrisk(){
        System.out.println("This is a single asterisk:");
        System.out.println(asterisk);
    }
    void printAVerticalLine(){
        System.out.println("This is a vertical line:");
        for (int i = 0; i < number; i++) {
            System.out.println(asterisk);
        }
    }
    void printAHorizontalLine(){
        System.out.println("This is a horizontal line:");
        for (int i = 0; i < number; i++) {
            asterisk += "*";
        }
        System.out.println(asterisk);
    }
    void printARightTriangle(){
        System.out.println("This is a right triangle:");
        for (int i = 0; i < number; i++) {
            System.out.println(asterisk);
            asterisk += "*";
        }
    }
}

class TrianglesTestDrive{
    public static void main(String[] args) {
        Triangles anAstrisk = new Triangles();
        anAstrisk.printAnAstrisk();

        Triangles verticalLine = new Triangles();
        verticalLine.setNumber(4);
        verticalLine.printAVerticalLine();

        Triangles horizontalLine = new Triangles();
        horizontalLine.setNumber(6);
        horizontalLine.printAHorizontalLine();

        Triangles rightTriangle = new Triangles();
        rightTriangle.setNumber(7);
        rightTriangle.printARightTriangle();
    }
}
