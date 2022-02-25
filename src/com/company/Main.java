package com.company;

import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public void greet(){
        System.out.println("Hej med dig! Hvad er dit navn?");
        String navn = sc.nextLine();
        System.out.println("Hej " + navn + "!");
        System.out.println("Hej igen!");
    }
    public int askForAge(){
        System.out.println("Hvor gammel er du?");
        int alder = sc.nextInt();
        System.out.println("Hello!!!");
        return alder;
    }

    public static void main(String[] args) {
        Main obj = new Main();

        obj.greet();
        System.out.println("Du er " + obj.askForAge() + " år gammel!");
        System.out.println("It works!");
    }
}
