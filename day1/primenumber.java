package day1;

public class primenumber {
    public static void main(String[] args) {
        int n = 7;
        prime(n);
    }
    public static void prime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) {
                System.out.printf("%.2f",0f);
                return;
            }
        }
        System.out.printf("%.2f",Math.sqrt(n));
    }
}
