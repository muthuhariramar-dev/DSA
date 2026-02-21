import java.util.Stack;
class Solution {
    public int largestRectangleArea(int[] heights) {
       Stack<Integer> stack = new Stack<>();
       int max =0;
       stack.push(0);

       for(int i = 0; i<heights.length;i++){
        while(!stack.isEmpty() && heights[i]< heights[stack.peek()]){
            max = getMax(heights,stack,max,i);
        }
        stack.push(i);
       }
       int i = heights.length;
       while(!stack.isEmpty()){
           max = getMax(heights,stack,max,i);
       }

       return max;
    }
    private static int getMax(int[] array , Stack<Integer> stack, int max ,int i ){
        int area ;
        int popped = stack.pop();
        if(stack.isEmpty()){
            area= array[popped] * i;
        }else{
            area = array[popped] * (i -1 -stack.peek());
        }
        return Math.max(max,area);
    }
}