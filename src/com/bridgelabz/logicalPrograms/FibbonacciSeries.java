package com.bridgelabz.logicalPrograms;
import java.util.Scanner;
public class FibbonacciSeries {
    public static void fibonacci() {
        /**
         * Scanner to take user input
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:->");
        int number = scanner.nextInt();
        int a = 0, b = 1, fib = 0;
        /**
         * initial values of fibbonacci series are a=0 & b=1
         */
        System.out.println("0");
        System.out.println("1");
        for (int i = 2; i < number; i++) {
            fib = a + b;
            System.out.println(fib);
            a = b;
            b = fib;
        }
        scanner.close();
    }

    public static void main(String[] args) {
        fibonacci();
    }
}


