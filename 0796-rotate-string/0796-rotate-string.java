// class Solution {
//     public boolean rotateString(String s, String goal) {
//         int x= 0;
//         for(int i = 0; i< goal.length(); i++){
//             if(s.charAt(0)== goal.charAt(i)){
//                 x=i;
//                 break;
//             }
//         }
//         // Stack<Character> st= new Stack<>();

//         for(int i=x; i<goal.length(); i++){
//             st.add(goal.charAt(i));
//         }
//         for(int i =0; i<x; i++){
//             st.add(goal.charAt(i));
//         }

//         String str="";
//        while(!st.isEmpty()){
//             str= st.pop()+str;       }
//         return s.equals(str);

//     }
// }
class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        return (s + s).contains(goal);
    }
}