class Solution {
    //kailas
    public boolean checkIfPangram(String s) {
        Set<Character> ch = new HashSet<>(); 
        for(int i=0;i<s.length();i++){
            ch.add(s.charAt(i));
        }
        return ch.size() == 26; 
    }
}