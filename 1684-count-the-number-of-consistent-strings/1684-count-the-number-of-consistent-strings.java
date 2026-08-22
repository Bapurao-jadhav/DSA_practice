class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i =0; i<words.length; i++){
            for(int j =0; j<words[i].length();j++){
                String ch = ""+words[i].charAt(j);
                if(!allowed.contains(ch)){
                    count++;
                    break;
                }
            }
        }
  
        return words.length-count;
    }
}