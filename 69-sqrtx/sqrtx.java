class Solution {
    public int mySqrt(int x) {
        int startInt = 0;
        int endInt= x;
        int ans =0;
        while(startInt <= endInt){
            int mid = startInt + (endInt -startInt)/2;
            long temp = (long) mid* mid;
            if( temp == x){
                return mid;
            }
            else if (temp < x){
                startInt = mid+1;
                ans = mid;
            }
            else{
                endInt = mid-1;
            }
        }
        return ans;
    }
}