package com.Ousman;

public class Main {
    public static void main(String[] args) {
        String name = "Ousman";
        int hungerLevel = 9000;

/*       println creates a new line to print on, while print does not, print also leaves cursor on current line.*/
        System.out.println("Hello " + name);
        System.out.println("My hunger level is over " + hungerLevel + "!");
        System.out.println("Let's play hide and seek.");
        System.out.print("Three...");
        System.out.print("Two...");
        System.out.println("One...");
        System.out.println("Ready or not, here I come!");
        /* use javac in the terminal to execute compiling. Compiling will check code and create a Main.class file in the same dir. run java Main to execute the Main.class file */
    }
}
