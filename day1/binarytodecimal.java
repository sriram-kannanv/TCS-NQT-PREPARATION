package day1;

import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int decimal = 0;
        int i = 0;
        while(n!=0) {
            int rem = n%10;
            n/=10;
            decimal += (int)rem * Math.pow(2,i);
            i++;
        }
        System.out.println(decimal);
    }
}
