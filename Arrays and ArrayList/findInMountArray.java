public class findInMountArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 5;
        int peakIndex = peakIndex(arr);
        int firstTry = orderedBinarySearch(arr, target, 0, peakIndex);
        if(firstTry != -1){
            System.out.println(firstTry);
        } else {
            int secondTry = orderedBinarySearch(arr, target, (peakIndex + 1), (arr.length - 1));
            System.out.println(secondTry);
        }
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

    static int orderedBinarySearch(int[] arr, int target, int start, int end){
        
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
