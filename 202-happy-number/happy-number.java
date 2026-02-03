class Solution {
    public boolean isHappy(int n) {
           int slow = n;
        int fast = n;

        do{
            slow =  findSquare(slow);
            fast = findSquare(findSquare(fast));
            
        }while(slow!=fast);
        
        if(slow == 1){
            return true;
        }
        
        return false;
        
    }
    private int findSquare(int number){
        int answer =0;
        while(number > 0){
            int rem = number %10;
            answer += rem * rem;
            number/=10;
        }
        return answer;
    
    }
}