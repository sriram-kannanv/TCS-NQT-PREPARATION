package day2;

public class sortarrayswithoutfunction {
    public static void main(String[] args) {
        int [] arr = {1,2,0,1,0};
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while(mid <= right) {
            if(arr[mid] == 1) {
                mid++;
            }
            else if(arr[mid] == 0) {
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;
                left++;
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
        for(int num: arr) {
            System.out.print    (num + " ");
        }
    }
}
