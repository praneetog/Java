public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-18, -12, -6, 0, 2, 3, 4, 15, 16, 18, 33, 45 ,98};
        int target = 33;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //return index if exists else -1
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
