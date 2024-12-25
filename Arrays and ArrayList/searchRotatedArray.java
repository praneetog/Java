public class searchRotatedArray {

    public static void main(String[] args) {
        // int[] arr = {4,5,6,7,0,1,2};
        int[] arr = {5,1,3};
        int target = 0;
        System.out.println(peakIndex(arr));
        // int peakIndex = peakIndex(arr);
        // int ans1 = binarySearch(arr, target, 0, peakIndex);
        // int ans2 = binarySearch(arr, target, peakIndex + 1, arr.length - 1);
        // if(ans1 != -1){
        //     System.out.println(ans1);
        // } else {
        //     System.out.println(ans2);
        }
        

    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid; //ans
            }
        }
        return -1; //if ans doesn't exists
    }
}
