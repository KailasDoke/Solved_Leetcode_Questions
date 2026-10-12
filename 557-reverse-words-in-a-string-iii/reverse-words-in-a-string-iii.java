class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+"); 
        StringBuilder result = new StringBuilder();
        for (String word : str) {
            // Reverse individual word and append with a space
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return result.toString().trim(); 
    }
}