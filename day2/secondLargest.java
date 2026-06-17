package day2;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,5,3,2,7,8,4};
        int largest = Integer.MIN_VALUE;
        int secondLargestt = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num > largest) {
                secondLargestt = largest;
                largest = num;
            }
            else if(num > secondLargestt && num != largest) {
                secondLargestt = num;
            }
        }
        System.out.println("Second Largest = " + secondLargestt);
    }
}
