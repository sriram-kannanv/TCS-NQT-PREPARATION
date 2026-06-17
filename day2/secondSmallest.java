package day2;

import java.util.Scanner;

public class secondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,5,3,2,7};
        int smallest = Integer.MAX_VALUE;
        int secondSmallestt = Integer.MAX_VALUE;
        for(int num : arr) {
            if(num < smallest) {
                secondSmallestt = smallest;
                smallest = num;
            }
            if(num < secondSmallestt && num != smallest) {
                secondSmallestt = num;
            }
        }
        System.out.println("Second Smallest = " + secondSmallestt);
    }
}
