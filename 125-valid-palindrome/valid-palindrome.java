class Solution {
    public boolean isPalindrome(String s) {
       
       String str =s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       
       int i =0;
       int Left= 0;
       int right = str.length()-1;
        while(Left < right){
            if(str.charAt(Left)!=str.charAt(right)){
                return false;
            }
            Left++;
            right--;

        }
        return true;
    }
}