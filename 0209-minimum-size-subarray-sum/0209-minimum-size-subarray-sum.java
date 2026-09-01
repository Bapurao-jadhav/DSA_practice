class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i =0;
        int j =0;
        int sum=0;
        int length=Integer.MAX_VALUE;
        while(j<nums.length){
            if(target == nums[j]){
                return 1;
            }
            sum+=nums[j];
            while(sum>=target){
                length=Math.min(length, (j-i)+1);
                sum-=nums[i];
                i++;
            }
            j++; 
        }
        if(length==Integer.MAX_VALUE){
            length=0;
        }
        return length;
    }
}