class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];

        for(int i = 0; i < n - 1; i = i + 2) {
            arr[i] = (i + 2) / 2;
            arr[i + 1] = -(i + 2) / 2;
        }

        if(n % 2 != 0) {
            arr[n - 1] = 0;
        }

        return arr;
    }
}