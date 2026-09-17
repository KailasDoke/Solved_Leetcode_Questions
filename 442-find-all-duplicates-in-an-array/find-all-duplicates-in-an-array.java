class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> a = new ArrayList<>(); 
        int i=0;
        
        int n = nums.length;

        while(i<n){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(int idx=0;idx<n;idx++){
            if(idx + 1 != nums[idx]){
                 a.add(nums[idx]);
            }
        }
        return a;
    }
}