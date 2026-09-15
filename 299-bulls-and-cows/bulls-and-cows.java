class Solution {
    public String getHint(String secret, String guess) {

        int bull = 0;
        int cow = 0;

        boolean[] used = new boolean[secret.length()];

        // Step 1: Find Bulls
        for(int i = 0; i < secret.length(); i++) {

            if(secret.charAt(i) == guess.charAt(i)) {
                bull++;
                used[i] = true;
            }
        }

        // Step 2: Find Cows
        for(int i = 0; i < secret.length(); i++) {

            // Skip Bull positions
            if(secret.charAt(i) == guess.charAt(i)) {
                continue;
            }

            for(int j = 0; j < secret.length(); j++) {

                if(!used[j] && secret.charAt(i) == guess.charAt(j)) {
                    cow++;
                    used[j] = true;
                    break;
                }
            }
        }

        return bull + "A" + cow + "B";
    }
}