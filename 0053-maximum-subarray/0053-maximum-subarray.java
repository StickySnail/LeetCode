class Solution {
  public int maxSubArray(int[] nums) {

    // [-2,1,-3,4,-1,2,1,-5,4]
    if (nums.length == 1)
      return nums[0];
    int[] max = new int[nums.length];
    max[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      max[i] = Math.max(nums[i], nums[i] + max[i - 1]);
    }
    int rst = max[0];
    for(int j=1; j<max.length; j++)
    rst = Math.max(rst, max[j]);
    return rst;
  }
}