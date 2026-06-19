package day3;

import java.util.Scanner;

public class combinationss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TOTAL PENCIL WANTED TO PURCHASE: ");
        int N = sc.nextInt();
        System.out.println("ENTER TOTAL ERASER WANTED TO PURCHASE: ");
        int M = sc.nextInt();
        System.out.println("ENTER TOTAL PENCIL MOM ALLOWED TO PURCHASE: ");
        int P = sc.nextInt();
        System.out.println("ENTER TOTAL ERASER MOM ALLOWED TO PURCHASE: ");
        int E = sc.nextInt();

        combination(N,M,P,E);

    }
    public static void combination(int N,int M,int P,int E) {

        int pencil_result = factorial(N) / (factorial(N-P)*factorial(P));
        int eraser_result = factorial(M) / (factorial(M - E)*factorial(E));
        System.out.println("COMBINATIONS OF TOTAL PURCHASE = " + pencil_result*eraser_result);
    }
    public static int factorial(int n) {
        int fact = 1;
        for(int i = 2; i <= n; i++) {
            fact*=i;
        }
        return fact;
    }
}
