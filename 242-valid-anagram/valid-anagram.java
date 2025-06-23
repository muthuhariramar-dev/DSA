class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())return false;


        HashMap<Character,Integer> str1 = new HashMap<>();
        HashMap<Character,Integer> str2 = new HashMap<>();

        for(char c: s.toCharArray()){
            str1.put(c,str1.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            str2.put(c,str2.getOrDefault(c,0)+1);
        }


        if(str1.equals(str2)) return true;

        





    return false;
    }
    
}