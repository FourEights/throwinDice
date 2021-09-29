package com.company;

//imports
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> sideLandedList = new ArrayList<Integer>();

        System.out.println("Welcome! How many sides would you like on your dice?");
        int diceSides = input.nextInt();
        System.out.println("Crafting your personal " + diceSides +"-sided dice, sir.\n\n");
        System.out.println("Your dice has been made.\n");
        System.out.println("How many times would you like to throw it?");
        int diceThrows = input.nextInt();
        System.out.println(diceThrows + ", excellent choice.");

        for (int i = 1; i <= diceThrows; i++) {

            int sideLanded = random.nextInt(diceSides);
            System.out.println("Throw number " + i + " resulted in a " + sideLanded);

            sideLandedList.add(sideLanded);

        }

        System.out.println("\n" + sideLandedList);


    }
}
