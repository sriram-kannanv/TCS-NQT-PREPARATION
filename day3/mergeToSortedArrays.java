package day3;

public class mergeToSortedArrays {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7};
        int [] arr2 = {2,4,10,12};
        sortt(arr,arr2);
    }
    public static void sortt(int [] arr, int [] arr2) {
        int [] result = new int[arr.length + arr2.length];
        int i = 0, j = 0;
        int result_index = 0;
        while(i<arr.length && j<arr2.length) {
            if(arr[i] < arr2[j]) {
                result[result_index] = arr[i];
                i++;
                result_index++;

            }
            else if(arr[i] > arr2[j]){
                result[result_index] = arr2[j];
                j++;
                result_index++;
            }

        }
        while(i < arr.length) {
            result[result_index++] = arr[i++];
        }
        while(j < arr2.length) {
            result[result_index++] = arr2[j++];
        }
        for(int num: result) {
            System.out.print(num + " ");
        }
    }

}
