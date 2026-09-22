class Solution {

    public String freqAlphabets(String s) {

        StringBuilder ans = new StringBuilder();
        int i = 0;

        while (i < s.length()) {

            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {

                char a = s.charAt(i);
                char b = s.charAt(i + 1);

                int num = (a - '0') * 10 + (b - '0');

                char ch = (char) ('a' + (num - 1));

                ans.append(ch);

                i += 3;
            }
            else {

                int num = s.charAt(i) - '0';

                char ch = (char) ('a' + (num - 1));

                ans.append(ch);

                i += 1;
            }
        }

        return ans.toString();
    }
}