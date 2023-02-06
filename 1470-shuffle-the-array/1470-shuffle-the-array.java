class Solution {
  public int[] shuffle(int[] nums, int n) {
    int[] even = new int[n];
    int[] odd = new int[n];
    int[] rst = new int[nums.length];

    int a = 0, b = 0;

    for (int i = 0; i < nums.length; i++) {
      if (i <n)
        even[a++] = nums[i];
      else
        odd[b++] = nums[i];
    }

    a = 0;
    b = 0;
    for (int k = 0; k < nums.length; k++) {
      if (k % 2 == 0)
        rst[k] = even[a++];
      else if (k % 2 != 0)
        rst[k] = odd[b++];
    }
    return rst;

  }
}