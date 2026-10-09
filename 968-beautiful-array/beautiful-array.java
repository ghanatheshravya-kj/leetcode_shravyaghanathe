class Solution {
    public int[] beautifulArray(int n) {
        return helper(n);
    }
    int[] helper(int n)
    {
        if(n==1)
        {
            return new int[]{1};
        }
        int [] odd=helper((n+1)/2);
        int [] even=helper(n/2);

        int[] res=new int[n];
        int index=0;
        for(int val:odd)
        {
            res[index++]=2*val-1;
        }
        for(int val:even)
        {
            res[index++]=2*val;
        }
        return res;
    }
}