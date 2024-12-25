 import java.util.*;
 
 public class firstAndLastPos {
    public static void main(String[] args) {
        firstAndLastPos rS = new firstAndLastPos();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] ans = rS.searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start; //first occurence of target
        ans[1] = end; //last occurence of target

        return ans;
    }

    int search(int[] nums, int target, boolean findStart){
        int ans = -1; //initializing ans to -1
        int start = 0;
        int end = nums.length - 1;
        while(start <=end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]) {
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid; //possible ans
                if(findStart){
                    end = mid - 1; //applying binary sort to first half
                } else {
                    start = mid + 1; //applying binary sort to second half
                }
            }
        }
        return ans;
    }
}
