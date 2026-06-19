package day3;

public class mergeTwoDifferentSortedArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,3,5,7};
        int [] arr2 = {10,9,4,2};
        sortt(arr1,arr2);
    }
    public static void sortt(int [] arr1, int[] arr2) {
        int i = 0;
        int j = arr2.length - 1;
        int result_index = 0;
        int [] result = new int[arr1.length + arr2.length];
        while(i<arr1.length && j >= 0) {
            if(arr1[i] < arr2[j]) {
                result[result_index++] = arr1[i++];
            }
            else {
                result[result_index++] = arr2[j--];
            }
        }
        while(i < arr1.length) {
            result[result_index++] = arr1[i++];
        }
        while(j >= 0) {
            result[result_index++] = arr2[j--];
        }
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
