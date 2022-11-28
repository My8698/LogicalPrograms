package com.bridgelabz.logicalPrograms;
import java.util.Scanner;
public class StopWatchProgram {
    public static void main(String[] args) {
        /**
         * creating object of class
         */
        StopWatchProgram stopwatch = new StopWatchProgram();
        /**
         * method called by object of class
         */
        stopwatch.elapsedTime();
    }
    void elapsedTime(){
        Scanner scanner = new Scanner(System.in);
        long time1 = 0, time2 = 0;
        System.out.println("Press the \"Enter\" key twice two check the time difference between the two entries ");
        String input = scanner.nextLine();
        if(input.isEmpty()) {
            time1 = System.currentTimeMillis();
        }
        input = scanner.nextLine();
        if(input.isEmpty()) {
            time2 = System.currentTimeMillis();
        }
        /**
         * measure elapsed time between start and ending stopwatch
         */
        System.out.println("Diffrence between two clicks is: " + ((int)(time2 - time1) / 1000) + " seconds.");
        scanner.close();
    }
}