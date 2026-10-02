class Solution {
    public int specialArray(int[] nums) {
        for(int x =1;x<=nums.length;x++){
            int count = findgreater(nums,x);
            if(count == x){
                return x;
            } 
        }
        return -1;
    }
    public int findgreater(int[] nums , int x ){
       int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=x){
                count++; 
            }
        }
        return count;
    }
}