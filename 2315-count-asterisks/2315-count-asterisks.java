class Solution {
    public int countAsterisks(String s) {
        int res=0;
        int count=0;
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(ch=='|'){
                count++;
            }
           if(count%2==0){
                if(ch=='*'){
                    res++;
                }
           }
        }
        return res;
    }
}