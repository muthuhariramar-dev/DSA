class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //start
        int start =0;
        //end
        int end =arr.length-1;
        //binary Search loop :/

        while(start < end ){
            //middle
            int mid = start + (end -  start)/2;

            // if the current element is greater than next element your are in decresing Part of the array
            if(arr[mid]> arr[mid+1]){
                //end is mid so no need to check beyond the decresing searching in left util loop voilate 
                end = mid;

            // your are in the Ascending part of the array
            //so we increase start by 1

            }else{
                //naturaly lay the highest number 
                start = mid+1;

            }
        }return start;
    }
}