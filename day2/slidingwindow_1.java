package day2;

public class slidingwindow_1 {
    public static void main(String[] args) {
        String s = "aabbbaaaba";
        int l = 3;
        int res = 0;
        for(int i = 0; i < s.length(); i+=l) {
            int count = 0;
            int end = Math.min(i+l,s.length());
            for(int j = i; j < end; j++) {
                if(s.charAt(j) == 'a') {
                    count += 1;
                }
            }
            if(count > res) {
                res = count;
            }
        }
        System.out.println(res);

    }
}
