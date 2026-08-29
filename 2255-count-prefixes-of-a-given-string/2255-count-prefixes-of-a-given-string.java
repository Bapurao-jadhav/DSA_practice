class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(int i =0; i<words.length; i++){
            if(words[i].length()>s.length())
                continue;

            int j=0;
              boolean p= true;
            while(j<words[i].length()){
              
                if(words[i].charAt(j) != s.charAt(j)){
                    p=false;
                    break;
                }
                j++;
            }
            if(p)
                count++;
        }
        return count;
    }
}