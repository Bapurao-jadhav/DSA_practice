import java.util.Hashtable;
class Solution {
    public int firstUniqChar(String s) {
        char res='0';
     LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

     for(int i =0; i<s.length(); i++){
        char ch = s.charAt(i);
        map.put(ch, (map.getOrDefault(ch,0))+1);
     }
    for(int i =0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(map.get(ch)==1){
            res=ch;
            break;
        }
     }
    for(int i =0; i<s.length(); i++){
        if(res== s.charAt(i)){
            return i;
        }
    }
     
return -1;
    }
}