class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length-1; i++){
            int first = nums[i];
            for(int a = i+1; a<nums.length; a++){
                int second = nums[a];
                if(first + second == target )
                return new int[]{i,a};
            }
        }
        return null;
    }
}
