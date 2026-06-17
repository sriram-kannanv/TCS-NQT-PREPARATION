package day1;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        palindrom(n);
    }
    public static void palindrom(int n) {
        int orginal = n;
        int rev = 0;
        while(n!=0) {
            int rem = n%10;
            rev = rev * 10 + rem;
            n/=10;
        }
        if(orginal==rev) {
            System.out.println("PALINDROME");
        }
        else {
            System.out.println("NOT PALINDROME");
        }
    }
}
