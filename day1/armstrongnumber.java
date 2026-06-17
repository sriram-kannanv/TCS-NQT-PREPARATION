package day1;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        armstrong(n);
    }
    public static void armstrong(int n) {
        int result = 0;

        int original = n;
        while(n!=0) {
            int rem = n%10;
            n/=10;
            result += rem*rem*rem;
        }
        if(result == original) {
            System.out.println("ARMSTRONG");
        }
        else {
            System.out.println("NOT ARMSTRONG");
        }

    }
}
