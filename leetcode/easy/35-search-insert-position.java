class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) /2 ;

            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        if (target > nums[mid]) {
            return mid + 1;
        } else {
            return mid;
        }
    }
}
