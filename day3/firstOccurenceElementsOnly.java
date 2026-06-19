package day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class firstOccurenceElementsOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,7,5,4,7,5,2};
        Set<Integer> set = new HashSet<>();
        for(int i =0 ; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);

            }
        }
        for(int num : set) {
            System.out.print(num + " ");
        }
    }
}
