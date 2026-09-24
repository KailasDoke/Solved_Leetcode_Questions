class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            freq[s.charAt(right) - 'A']++;

            // Find the highest frequency character
            maxFreq = Math.max(
                maxFreq,
                freq[s.charAt(right) - 'A']
            );

            // Number of characters we need to replace
            int replacements = (right - left + 1) - maxFreq;

            // If replacements exceed k, shrink window
            while (replacements > k) {

                freq[s.charAt(left) - 'A']--;
                left++;

                replacements = (right - left + 1) - maxFreq;
            }

            // Update maximum window length
            maxLength = Math.max(
                maxLength,
                right - left + 1
            );
        }

        return maxLength;
    }
}