import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr = new ArrayList<>();
        String sum = "";

        for(int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        BigInteger sumn = new BigInteger(sum);
        sumn = sumn.add(BigInteger.valueOf(k));

        String result = sumn.toString();

        for(int i = 0; i < result.length(); i++) {
            arr.add(result.charAt(i) - '0');
        }

        return arr;
    }
}