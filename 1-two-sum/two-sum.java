class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0 ;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(target==nums[i]+nums[j])
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
             
       
    }
}