package problems;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        System.out.println("enter the number a :");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.println("enter the number b :");

        int b = scanner.nextInt();

        System.out.println("Result = "+ (a+b));
    }
}