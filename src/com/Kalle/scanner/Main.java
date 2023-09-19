package com.Kalle.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Input Number");
            int result = sc.nextInt();

            System.out.println("You picked: " + result);

        } while (true);


        boolean isPlaying = true;

        do {
            int result = scannerNumber();

            for (int i = 0; i < result; i++) {
                System.out.println(i);
                System.out.println("Looping...");
            }

            if (result > 1000) {
                isPlaying = false;
            }

        } while (isPlaying);

        // while (true) {
        // scanner();
        // return; - om man vill hoppa ut
        // }

    }

    public static int scannerNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert a number");

        return sc.nextInt();

    }

    public static String scannerText() {
        Scanner sc = new Scanner(System.in);

        System.out.println("insert some sentence");
        String input = sc.nextLine();

        return input;
    }

}
