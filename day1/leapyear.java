package day1;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        leadyear(year);
    }
    public static void leadyear(int year) {
        if(year % 100 == 0) {
            if(year%400 ==0) {
                System.out.println("Leap Year");
            }
            else {
                System.out.println("Not a Leap Year.");
            }
        }
        else {
            if(year % 4 == 0) {
                System.out.println("Leap Year.");
            }
            else {
                System.out.println("Not a leap year.");
            }
        }
    }
}
