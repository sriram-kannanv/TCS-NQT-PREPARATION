package day1;

import java.util.Scanner;

public class strongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        strong(n);
    }
    public static void strong(int n) {
        int original = n;
        int sum = 0;
        while(n!=0) {
            int rem = n%10;
            sum += fact(rem);
            n/=10;

        }
        if(sum == original) {
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        };
    }
    public static int fact(int n) {
        int factorial = 1;
        for(int i = 2; i <= n; i++) {
            factorial*=i;
        }
        return factorial;
    }
}
