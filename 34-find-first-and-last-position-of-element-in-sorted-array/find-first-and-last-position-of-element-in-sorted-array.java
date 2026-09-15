class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findfirst(nums,target);
        result[1] = findright(nums,target);
        return result;
    }
    public int findfirst(int[] a , int t){
        int start=0;
        int end = a.length-1;
        int ans = -1;
        int mid = start + (end - start)/2;
        while(start<=end){
            if(a[mid]==t){
            ans = mid;
            end = mid - 1;
            }
            else if(a[mid]<t){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
            mid = start+(end - start)/2;

        }
        return ans;
        
    }
     public int findright(int[] a , int t){
        int start=0;
        int end = a.length-1;
        int ans = -1;
        int mid = start + (end - start)/2;
        while(start<=end){
            if(a[mid]==t){
            ans = mid;
            start = mid +1;
            }
            else if(a[mid]<t){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
            mid = start+(end - start)/2;

        }
        return ans;
        
    }
}