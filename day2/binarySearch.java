package day2;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,3,5,7,9,11,13};
        int left = 0;
        int right = arr.length - 1;
        System.out.print("Enter the number to search: ");
        int n = sc.nextInt();
        while(left<=right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == n) {
                System.out.println("FOUND!!");
                return;
            }
            else if(arr[mid] > n) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        System.out.println("NOT FOUND!");
    }
}
