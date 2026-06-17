package day2;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,3,5,8,45};
        System.out.print("Enter the number to search : ");
        int n = sc.nextInt();
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

    }
}
