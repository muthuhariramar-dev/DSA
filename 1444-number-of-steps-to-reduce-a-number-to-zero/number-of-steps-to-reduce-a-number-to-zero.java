class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
        
        
    }
    static int helper(int n,int step){
        if(n==0){
            return step;
        }
        if(n%2==0){
            n/=2;
            return helper(n,step+1);
        }

        return helper(n-1,step+1);
        
    }
}