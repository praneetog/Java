import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int s = low, e = high, mid = s + (e - s) / 2, pivot = arr[mid];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }

            while(arr[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        //now pivot is at its correct index so apply quick sort again
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
