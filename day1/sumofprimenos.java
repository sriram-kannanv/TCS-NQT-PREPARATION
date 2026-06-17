package day1;

import java.util.Scanner;

public class sumofprimenos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(sumofprime(n1,n2));
    }
    public static int sumofprime(int n, int m) {
        int sum = 0;
        for(int j = n+1; j < m; j++) {
            if(prime(j)) {
                sum += j;
            }
        }
        return sum;
    }
    public static boolean prime(int n) {
        for(int i = 2; i <=Math.sqrt(n);i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
