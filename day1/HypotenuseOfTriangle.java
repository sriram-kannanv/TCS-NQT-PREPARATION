package day1;

import java.util.Scanner;

public class HypotenuseOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        double result = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
        System.out.printf("Hypotenuse = %.2f",result);
    }
}
