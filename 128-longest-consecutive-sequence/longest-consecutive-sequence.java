class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int max =0;

        for(int num:set){
            int currentLen=0;
            if(set.contains(num-1)) continue;

            while(set.contains(num)){
                currentLen++;
                num+=1;
            } max =  Math.max(max,currentLen);
        }
        return max;
    }
}
