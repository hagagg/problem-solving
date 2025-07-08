class Solution {
    public boolean canJump(int[] nums) {
        int lastIndex = nums.length - 1;
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= lastIndex) {
                return true;
            }
        }
        return true;
    }
}