class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for(int a : candies){
            if(a>max){
                max=a;
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(int c : candies){
            if(extraCandies+c>=max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}