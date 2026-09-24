class Solution {
    public boolean canJump(int[] nums) {
        int i =0;
        int fasthest = 0;
        while(i<nums.length){
            
            if (i > fasthest){
              return false;
             }
             fasthest = Math.max(fasthest, i + nums[i]);
              if(fasthest>=nums.length-1){
                return true;
            }
            
            i++;
        }
        return false;
    }
}