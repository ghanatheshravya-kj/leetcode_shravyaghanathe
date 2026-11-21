class Solution {
    public int maxArea(int[] height) {
        int maxArea=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<right)
        {
            int len=Math.min(height[left],height[right]);
            int bre=right-left;

            int curr=len*bre;
            maxArea=Math.max(curr,maxArea);
            if(height[left]<height[right])
            {
                left++;
            }
            else
               right--;
        }
        return maxArea;
    }
}