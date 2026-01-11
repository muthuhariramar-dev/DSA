class Solution {
    public int missingNumber(int[] nums) {
        //index for travesing if is in Correct index

        int i =0;
        //until the index is lessThan the array Size it will Loop over it
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!= nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }



        }

        for(int j =0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }

        return nums.length;
    }
}