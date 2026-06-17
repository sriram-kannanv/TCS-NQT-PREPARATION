package day2;

import java.util.Scanner;

public class swapwithouttepm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swap " + a + b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("AFTER SWAP" + a + b);
    }
}
