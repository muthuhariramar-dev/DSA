class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum =0;
        int max =Integer.MIN_VALUE;
        for(int[] nums: accounts){
            for(int innernums:nums ){
                sum+=innernums;
                max=Math.max(sum,max);
            }
            sum=0;
        }
        return max;
    }
}