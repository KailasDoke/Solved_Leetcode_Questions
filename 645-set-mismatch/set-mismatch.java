class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        int[] arr = new int[2];
        int n = nums.length;
        while(i<n){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int tep = nums[i];
                nums[i]=nums[correct];
                nums[correct]=tep;

            }
            else{
                i++;
            }
        }
        for(int idx=0;idx<n;idx++){
            if(nums[idx]!=idx+1){
                arr[0]=nums[idx];
                arr[1]=idx+1;

            }
        }
        return arr;
    }
}