/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int answer = AgnosticBinarySearch(mountainArr,target,0,peak,true);
        if(answer != -1) return answer;
        return AgnosticBinarySearch(mountainArr,target,peak+1,mountainArr.length()-1,false);
        
    }
    int peakIndexInMountainArray(MountainArray mountainArr){
        int start =0;
        int end = mountainArr.length()-1;
        while(start < end){
            int mid = start + (end - start )/2;

            if(mountainArr.get(mid)> mountainArr.get(mid+1)){
                end = mid;

            }else{
                start = mid +1;
            }
        }
        return start;
    }
    int AgnosticBinarySearch(MountainArray mountainArr ,int target,int start,int end,boolean isAsc){
        //boolean isAsc = mountainArr.get(0) < mountainArr.get(mountainArr.length()-1);
        while(start <= end){
            int mid = start +(end -start)/2;
            if(target == mountainArr.get(mid)){
                return mid;
            }
            else{
            if(isAsc){
                if(target < mountainArr.get(mid)){
                end = mid-1;
            }else{
                start = mid+1;  
            }
            }else{
                if(target > mountainArr.get(mid)){
                end = mid-1;
            }else{
                start = mid+1;  
            }
            }
            }
            
        }
            return -1;

    }
}