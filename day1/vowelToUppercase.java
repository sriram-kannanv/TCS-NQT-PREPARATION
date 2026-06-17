package day1;

import java.util.Scanner;

public class vowelToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        changeVowelToUpper(str);
    }
    public static void changeVowelToUpper(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='0' || ch =='u') {
                result.append(Character.toUpperCase(ch));
            }
            else {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
