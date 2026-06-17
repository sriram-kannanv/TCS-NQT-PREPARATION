package day1;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = gcdd(n,m);
        System.out.println("GCD = "+a);
    }

    public static int gcdd(int n,int m) {
        /*
        int min = n < m ? n:m;
        for(int i = min; i >=1; i--) {
            if(n%i == 0 && m%i == 0) {
                return i;
            }
        }
        return 1;

         */
        int a;int b;
        if(n < m) {
            a = m; b=n;

        }
        else {
            a= n; b = m;
        }
        while(b!=0) {
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}
