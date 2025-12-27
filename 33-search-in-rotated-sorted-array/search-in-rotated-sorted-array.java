class Solution {
    public int search(int[] nums, int target) {
        int answer = findPivot(nums);
        if(nums[answer] == target){
            return answer;
        }
        int firstHalf = binarySearch(nums,target,0,answer);
        if(firstHalf!=-1)return firstHalf;
        
        
        int secondHalf =  binarySearch(nums,target,answer+1,nums.length-1) ;
        // if(secondHalf!=-1)
        return secondHalf;

        // return seconha;
    }
    int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start <end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid]>nums[mid+1]){
               return  mid;

            }else if(mid > start && nums[mid] < nums[mid - 1]){
                return mid-1;
                
            }else if(nums[mid]<= nums[start]){
                end = mid-1;
            }
            else{
                start = mid +1;

            }

        }
        return start;
    }
    int binarySearch(int[] nums,int target,int start,int end){
        while(start <= end){
            int mid = start + (end -start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
        
    }
    
}