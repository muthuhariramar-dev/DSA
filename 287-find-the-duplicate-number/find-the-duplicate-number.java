class Solution {
    public int findDuplicate(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!= i+1){
                if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i]= nums[correct];
                nums[correct]= temp;

                }else{
                return nums[i];
                }
            }else{
                i++;
            }
            

        }

        for(int index  = 0;index <nums.length;index++){
            if(nums[index] != index+1){
                return index+1;
            }
        }
        return nums[0];
    }
}