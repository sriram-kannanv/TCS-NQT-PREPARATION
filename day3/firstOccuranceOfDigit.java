package day3;

import java.util.Scanner;

public class firstOccuranceOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements: ");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to find the first occurance: ");
        int num = sc.nextInt();
        firstOccur(num,arr);
    }
    public static void firstOccur(int num, int [] arr) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left <=right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == num) {
                ans = mid;
                right = mid - 1;
            }
            else if(arr[mid] > num) {
                right = mid - 1;
//79 79 79 84 87 92 102 102 102 105 111 111
            }
            else {
                left = mid + 1;
            }
        }
        System.out.println("First occurance of Element is at the Index: " +ans);
    }


}
