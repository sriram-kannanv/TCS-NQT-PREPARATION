package day1;

import java.util.Scanner;

public class perfectsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        perfectsqua(n);
    }
    public static void perfectsqua(int n) {

        int sqrrt =(int) Math.sqrt(n);
        int num = sqrrt*sqrrt;
        if(num == n) {
            System.out.println("Perfect Square.");
        }
        else {
            System.out.println("Not a perfect square.");
        }
    }
}
