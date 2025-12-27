
class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end =0;
        for(int n :nums){
            start = Math.max(start,n);
            end+=n;
        }
        while(start < end){
            int mid = start + (end -start)/2;


            int sum = 0;
            int pecies = 1;
            for(int number : nums){
                if(sum + number > mid){
                    sum = number;
                    pecies++;

                }else{
                    sum+=number;
                }
            }

            if(pecies > k){
                start= mid +1;
            }else{
                end = mid;
            }
            
        }
        return start;
    }
}