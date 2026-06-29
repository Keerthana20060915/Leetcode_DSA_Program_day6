class Solution {
    public int findGCD(int[] nums) {
        int i,min,max;
        int numslength = nums.length;
        Arrays.sort(nums);
        min = nums[0];
        max = nums[numslength-1];
        while(max!=0)
        {
            int temp = max;
            max = min%max;
            min = temp;
        }
        return min;
        
    }
}
