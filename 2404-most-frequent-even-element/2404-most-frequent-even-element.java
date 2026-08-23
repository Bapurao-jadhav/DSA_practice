class Solution {
    public int mostFrequentEven(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int freqEle=-1;
        int count=0;
        for(int i : nums){
            if(i%2==0){
            if(map.get(i)==count){
                if(i<freqEle){
                    freqEle=i;
                }
            }
            if(map.get(i)>count){
                freqEle=i;
                count=map.get(i);
            }
            if(map.get(i)<count){
                continue;
            }
            }
        }
        
        return freqEle;
    }
}