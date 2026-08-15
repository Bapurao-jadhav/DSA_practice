class Solution {
    public int maximumLengthSubstring(String s) {
        Map <Character, Integer> map = new HashMap<>();
       int i =0;
       int j =0;
       int max =0;
       while (j<s.length()){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char remove= s.charAt(i);
                map.put(remove, map.get(remove)-1);
                i++;
            }
            int len= (j-i)+1;
            if(max<len)
                 max= len;
            j++;
       }
       return max;
    }
}