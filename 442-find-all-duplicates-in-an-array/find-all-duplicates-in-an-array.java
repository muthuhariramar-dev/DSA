class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
        
        List<Integer> list = new ArrayList<>();
        for(int index =0;index< nums.length;index++){
            if(nums[index]!= index+1){
                list.add(nums[index]);
            }
        }
        return list;
    }
}