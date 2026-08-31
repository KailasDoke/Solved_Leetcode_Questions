class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
     List<Integer> a = new ArrayList<>();
      int i,j,temp;   
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
     for(int k=0;k<nums.length;k++){
        if(nums[k] == target){
            a.add(k);
        }
        //Collections.sort(a);
     }
     return a;   
    }
}