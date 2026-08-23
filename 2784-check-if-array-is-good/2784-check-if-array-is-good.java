class Solution {
    public boolean isGood(int[] nums) {
        int max =0;
        for (int i : nums){
            if(max<i)
                max=i;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        if(max+1 != nums.length){
            return false;
        }
        for(int i: nums){
            if(map.get(max)!=2){
                return false;
            }
            if(i!=max){
                if(map.get(i)!=1){
                    return false;
                }
            }
        }
        return true;
    }
}