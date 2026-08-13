class Solution {
    public int[] sortedSquares(int[] nums) {
       
        for(int i=0; i<nums.length; i++){
            nums[i]=Math.abs(nums[i]);
        }

        int[] res= new int[nums.length];
        Arrays.sort(nums);
        for(int i =0; i<nums.length; i++){
            res[i]=nums[i]*nums[i];
        }
        return res;
    }
}