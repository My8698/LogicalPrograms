package com.bridgelabz.logicalPrograms;
import java.util.Scanner;
public class CouponNumber {
    /**
     *program to generate distinct coupon number
     */
    public static int getCoupon() {
        /**
         * to generate random coupon numbers
         */
        return((int)(Math.random()*9000)+1000);
    }
    public static void check(int number) {
        String str = "";
        int count=1;
        while(count<=number) {
            String str1 = ""+getCoupon();
            if(str.contains(str1)) {
                System.out.println("Coupon already exist  ");
            }
            else
                str=str+str1;
            count++;
            System.out.println(str1);
            System.out.println("   ");
            System.out.println("Updated to " +str);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbers of coupons required");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        check(number1);
        scanner.close();
    }
}