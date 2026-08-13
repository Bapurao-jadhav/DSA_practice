class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[]temp=new int[arr.length];
        for (int i = 0; i<temp.length; i++){
            temp[i]=arr[i];
        }
        int []res = new int[arr.length];
        Arrays.sort(arr);

        Map<Integer, Integer>map = new HashMap<>();
        int count=1;
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], count++);
            }
        }
        
        for(int i=0; i<temp.length; i++){
            res[i]=map.get(temp[i]);
        }

        return res;
    }
}