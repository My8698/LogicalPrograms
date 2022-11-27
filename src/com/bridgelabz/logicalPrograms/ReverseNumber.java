package com.bridgelabz.logicalPrograms;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args)
    {
        /**
         * initially assign reverse=0
         */
        int number, reverse = 0;
        System.out.println("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        while(number != 0)
        {
            /**
             * logic for reverse number
             */
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        scanner.close();
        System.out.println("The reverse of the above number is : " +reverse);
    }
}