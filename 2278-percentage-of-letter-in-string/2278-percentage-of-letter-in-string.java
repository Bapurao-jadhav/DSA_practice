class Solution {
    public int percentageLetter(String s, char letter) {
        Map <Character, Integer> map = new HashMap<>();
        for (int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
      
        return (map.getOrDefault(letter,0)*100)/s.length();
    }
}