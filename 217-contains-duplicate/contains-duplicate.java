class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> list = new HashSet<>();

        for(int n : nums){
            if(list.contains(n)){
                return true;
            }
            list.add(n);
        }
        return false;
    }
}