class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Store numbers we've seen: number -> index
        Map<Integer , Integer> seenNumbers = new HashMap <>();

        for (int i = 0; i < nums.length; i++){
            int neededNumber = target - nums[i];

            if (seenNumbers.containsKey(neededNumber)){
                return new int[]{seenNumbers.get(neededNumber) , i};
            }
            seenNumbers.put (nums[i] , i);
        }
        return new int [0];
    }
}
