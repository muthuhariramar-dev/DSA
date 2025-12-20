import java.lang.*;
class Solution {
    public String longestPalindrome(String s) {

        int[][] dp = new int[s.length()][s.length()];
        char[] sa = s.toCharArray();
        for(int i =0;i<s.length();i++){
            for(int j =0;j<s.length();j++){
                dp[i][j]=-1;
            }
        }
        int longest =1;
        int start=0,end=0;
        for(int i =1;i<=s.length();i++){
            for(int j =0;j+i-1<s.length();j++){
                if(i ==1){
                    dp[j][j]=1;
                    end =1;

                }else if(i ==2 && sa[j]== sa[j+1]){
                    dp[j][j+1] = 2;
                    longest=2;
                    start = j;
                    end =j+2; 

                }else if(sa[j] == sa[j+i-1] && dp[j+1][j+i-2]!=-1){
                    dp[j][j+i-1] = dp[j+1][j+i-2]+2;
                    if(dp[j][j+i-1] > longest){
                        longest = dp[j][j+i-1];
                        start = j;
                        end = j+i;
                    }
                }
            }
        }
        return s.substring(start,end);
    }
}