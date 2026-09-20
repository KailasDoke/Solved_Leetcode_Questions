class Solution {
    public boolean halvesAreAlike(String s) {
        String a = "";
        String b = "";
        int n = s.length()/2;
        String v = "aeiouAEIOU";
        int c =0;
        int d = 0;
        a = s.substring(0,n);
        b = s.substring(n);
        for(int i = 0;i<n;i++){
            if (v.indexOf(s.charAt(i)) != -1) {
                c++;
        }
        }
         for(int j =n;j<s.length();j++){
            if (v.indexOf(s.charAt(j)) != -1) {
                d++;
        }
         }
        if(c != d){
            return false;
        }
        return true;
    }
}