3105. Longest Strictly Increasing or Strictly Decreasing Subarray

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 0) {
            return 0;
        } 
        int maxLength = 1, asc = 1, desc = 1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]>nums[i-1]) {
                asc++;
                desc = 1;
            } else if(nums[i]<nums[i-1]) {
                desc++;
                asc = 1;
            } else {
                asc = desc = 1;
            }
            maxLength = Math.max(maxLength, Math.max(asc, desc));
        }
        return maxLength;
    }
}
