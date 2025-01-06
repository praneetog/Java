import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] sortedArr = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        //Array is divided into 2 halves and stored in 2 different arrays
        //then their halves will be divided until single element remains
        //then they will be merged in a sorted manner
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i=0, j=0, k=0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }
        
        //In case one of the array is completed and other one still 
        //has some elements then we will add it in the end
        while(i < first.length){
            mix[k++] = first[i++];
        }

        while(j < second.length){
            mix[k++] = second[j++];
        }

        return mix;
    }
}