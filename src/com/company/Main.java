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

    public static void main(String[] args) {
        Main obj = new Main();

        obj.greet();
        System.out.println("It works!");
    }
}
