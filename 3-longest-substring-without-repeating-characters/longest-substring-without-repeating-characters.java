class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        //Hash Set Creation
        HashSet<Character> set = new HashSet<>();
        //Two pointer
        int right=0;
        int left =0;
        //max Value
        int max =0;
        //traversing  in =character array
       while (right < s.length()) {
            char c = s.charAt(right);
            //if character not cointain in the set 
            if(!(set.contains(c))){
                //add the character
                set.add(c);
                //then move right pointer 
                right++;
                //calculate the max value by size of the sett
                max = Math.max(max,set.size());
            }
            else{
                // if already present in the array then remove the character
                set.remove(s.charAt(left));
                //move the left pointer
                left++;
            }
        }
    //RETURN MAX VALUE
    return max;
    }
}