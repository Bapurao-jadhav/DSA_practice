class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String word: words){
            for(int j =0; j<word.length();j++){
                String ch = ""+word.charAt(j);
                if(!allowed.contains(ch)){
                    count++;
                    break;
                }
            }
        }
  
        return words.length-count;
    }
}