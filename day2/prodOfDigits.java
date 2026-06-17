package day2;

import java.util.Scanner;

public class prodOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int res = 1;
        int n = sc.nextInt();
        while(n!=0) {
            int rem = n%10;
            if(rem == 0) {
                res*=1;
            }
            else {
                res *= rem;

            }
            n/=10;
        }
        System.out.println(res);
    }
}
