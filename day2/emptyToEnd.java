package day2;

import java.util.Scanner;

public class emptyToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 0;
        int [] arr = {1,3,0,3,5,0,4};

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] !=0) {
                arr[start] = arr[i];
                start++;
            }
        }
        for(int i = start; i < arr.length; i++) {
            arr[i] = 0;
        }
        for(int i = 0; i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
