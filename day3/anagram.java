package day3;

import java.util.HashMap;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        checkAnagram(str1,str2);
    }
    public static void checkAnagram(String s1,String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s1.length() != s2.length()) {
            System.out.println("NOT ANAGRAM!!!");
            return;
        }
        else {
            for(int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                map.put(ch,map.getOrDefault(ch,0) + 1);
            }
            for(int i = 0; i < s2.length();i++) {
                char ch = s2.charAt(i);
                if(!map.containsKey(ch)) {
                    System.out.println("NOT ANAGRAM!!");
                    return;
                } else if (map.containsKey(ch)) {
                    map.put(ch,map.get(ch) - 1);

                }
                if(map.get(ch) == 0) {
                    map.remove(ch);
                }
            }
            System.out.println(map.isEmpty());
        }

    }
}
