package day2;

import java.util.Scanner;

public class maxOfA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int N = sc.nextInt();
        int maxiA = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i+=N) {
            int end = Math.min(i+N, s.length());

            int count = 0;
            StringBuilder currResult = new StringBuilder();
            for(int j = i; j < end; j++) {
                if(s.charAt(j) == 'a') {
                    count++;
                }
                currResult.append(s.charAt(j));

            }
            if(count > maxiA) {
                maxiA = count;
                result = currResult;
            }
        }
        System.out.println(maxiA);
        System.out.println(result.toString());
    }
}
