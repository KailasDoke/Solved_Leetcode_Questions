class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> a = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        
        while(i<n){
            int correct = nums[i] -1;
            if(nums[i]!=nums[correct]){
                int tep = nums[correct];
                nums[correct]=nums[i];
                nums[i]=tep;
            }
            else{
                i++;
            }
        }
        for(int idx=0;idx<nums.length;idx++){
            if(idx != nums[idx]-1){
                a.add(idx+1);
            }
        } 
        return a;
    }
}