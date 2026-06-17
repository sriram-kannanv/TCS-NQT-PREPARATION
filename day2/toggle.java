package day2;
//input integer
//convert to binary
//toggle binary
//convert to decimal

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toggle(n);
    }
    public static void toggle(int n) {
        int temp = (Integer.highestOneBit(n) << 1) - 1;
        int res= n^temp;
        System.out.println(res);
    }
}
