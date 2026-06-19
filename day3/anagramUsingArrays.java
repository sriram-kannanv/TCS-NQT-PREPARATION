package day3;

import java.util.Scanner;

public class anagramUsingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(anagram(s1,s2));
    }
    public static boolean anagram(String s1, String s2) {
        if(s1.length()!=s2.length()) {
            return false;
        }
        else {
            int [] res = new int[26];
            for(int i = 0; i < s1.length(); i++) {
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(i);
                res[ch1 - 'a']++;
                res[ch2 - 'a']--;
            }
            for(int num : res) {
                if(num!=0) {
                    return false;
                }

            }
            return true;
        }


    }

}

