package day1;

import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decimal_binary(n));
    }
    public static String decimal_binary(int n) {
        StringBuilder sb = new StringBuilder();
        while(n!=0) {
            int rem = n%2;
            n/=2;
            sb.insert(0,rem);
        }
        return sb.toString();
    }
}
