import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        s=s+" ";
        Map<Character, String> map1= new HashMap<>();
        Map<String, Character> map2= new HashMap<>();

        int count=0;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch==' '){
                count++;
            }
        }

        if(count != pattern.length()){
            return false;
        }

        int j =0;
        String word="";
        for(int i =0; i<s.length();i++ ){
            char ch = s.charAt(i);
            if(ch !=' '){
                word+=ch;
            }else{
                if(!map1.containsKey(pattern.charAt(j))){
                    map1.put(pattern.charAt(j), word);
                }
                 if(!map2.containsKey(word)){
                    map2.put(word,pattern.charAt(j));
                }
                j++;
                word="";
            }
        }

        String res="";
        for(int i =0; i<pattern.length(); i++){
            char ch =pattern.charAt(i);
            if(ch != map2.get(map1.get(ch))){
                return false;
            }
            res= res+map1.get(pattern.charAt(i))+" ";
        }

    return res.equals(s);
        
    }
}