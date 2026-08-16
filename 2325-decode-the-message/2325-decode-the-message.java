class Solution {
    public String decodeMessage(String key, String message) {
        Map <Character, Character> map = new HashMap<>();
        char a = 'a';
        for (int i=0; i<key.length(); i++){
            char ch = key.charAt(i);
            if(ch==' ')
                map.put(ch,' ');
            if(!map.containsKey(ch)){
                map.put(ch,a++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<message.length(); i++){
            char ch = message.charAt(i);
            if(ch==' '){
                sb.append(" ");
                continue;
            }
            sb.append(map.get(ch));
        }
    return sb.toString();
    }
}