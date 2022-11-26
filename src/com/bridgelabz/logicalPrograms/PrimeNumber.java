package com.bridgelabz.logicalPrograms;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int temporary = 0,flag = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int number = scanner.nextInt();
        temporary = number/2;
        if(number == 0||number == 1){
            System.out.println(number+" is not prime number");
        }else{
            for(int i=2; i<=temporary; i++){
                if(number%i == 0){
                    System.out.println(number+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                System.out.println(number+" is prime number");
            }
        }
        scanner.close();
    }
}