package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();

        System.out.println(palindrom(A));
    }

    public static boolean palindrom(String A)
    {
        String B = new StringBuilder(A).reverse().toString();
        if (B.equals(A))
            return true;
        else return false;
    }
}