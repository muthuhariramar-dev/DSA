class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int digit =0;
        for(int number :nums){
            while(number>0){
                digit++;
                number=number/10;
                System.out.print(number);

            }
            if(digit%2 == 0){
                count++;
                
            }
            digit=0;
        }
        return count;
    }
}