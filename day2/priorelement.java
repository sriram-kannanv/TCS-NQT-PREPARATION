package day2;

public class priorelement {
    public static void main(String[] args) {
        int [] arr = {5,3,6,7,10,2};
        int count = 1;
        int max = arr[0];
        for(int i = 1; i <arr.length;i++) {
            if(arr[i] > max) {
                count++;
                max = arr[i];
            }
        }
        System.out.println(count);
    }
}
