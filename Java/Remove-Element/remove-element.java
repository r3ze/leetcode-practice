class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int c = 0;
        for(int i=0;i<nums.length;i++)
        {
        if(nums[i]!=val)
        {
            nums[c++]=nums[i];
        }
        }
        return c;
    }
}