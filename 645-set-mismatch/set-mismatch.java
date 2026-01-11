class Solution {
    public int[] findErrorNums(int[] nums) {
        int i =0;
        while(i<nums.length){
            int current = nums[i]-1;
            if( nums[i] != nums[current]){
                int temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
                }else{
                    i++;
                }
        }
        
    
        for(int index =0;index< nums.length;index++){
            if(nums[index]!= index+1){
                return new int[] {nums[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
}