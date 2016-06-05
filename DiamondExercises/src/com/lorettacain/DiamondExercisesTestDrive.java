package com.lorettacain;

class DiamondExercises{

    private String asterisk = "*";
    private String space = "";
    private int lines;
    private String name;

    void setLineAmount(int l){
        lines = l;
    }
    void setName(String n){
        name = n;
    }

    void createSpaces(){
        for (int i = 0; i < lines; i++){
            space += " ";
        }
    }
    void printTopOfDiamond(){
        for (int i = 0; i < lines; i++) {
            space = space.substring(0, space.length()-1);
            System.out.println(space + asterisk);
            asterisk += "**";
        }
    }
    void printBottomOfDiamond(){
        for (int i = 1; i < lines; i++) {
            if(i == 1 ) {
                asterisk = asterisk.substring(0, asterisk.length() - 2);
                space += " ";
            }
            asterisk = asterisk.substring(0, asterisk.length()-2);
            System.out.println(space + asterisk);
            space += " ";
        }
    }
    void printBottomOfNamedDiamond(){
        for (int i = 1; i < lines; i++) {

            asterisk = asterisk.substring(0, asterisk.length()-2);
            System.out.println(space + asterisk);
            space += " ";
        }
    }
    void printTopOfNamedDiamond(){
        for (int i = 1; i <= lines; i++) {
            if (i == lines){
                System.out.println(name);
            }
            else {
                space = space.substring(0, space.length() - 1);
                System.out.println(space + asterisk);
                asterisk += "**";
            }
        }
    }
    void printAnIsoscelesTriangle(){
        System.out.println("This is an isosceles triangle with " + lines + " lines.");
        createSpaces();
        printTopOfDiamond();
    }
    void printADiamond(){
        System.out.println("This is a diamond with " + lines + " lines.");
        createSpaces();
        printTopOfDiamond();
        printBottomOfDiamond();
    }
    void printANamedDiamond(){
        System.out.println("This is a named diamond with " + lines + " lines.");
        createSpaces();
        printTopOfNamedDiamond();
        printBottomOfNamedDiamond();
    }
}

class DiamondExercisesTestDrive{
    public static void main(String[] args){
        DiamondExercises isosceles = new DiamondExercises();
        isosceles.setLineAmount(6);
        isosceles.printAnIsoscelesTriangle();

        DiamondExercises diamond = new DiamondExercises();
        diamond.setLineAmount(5);
        diamond.printADiamond();

        DiamondExercises namedDiamond = new DiamondExercises();
        namedDiamond.setLineAmount(4);
        namedDiamond.setName("Loretta");
        namedDiamond.printANamedDiamond();
    }
}
