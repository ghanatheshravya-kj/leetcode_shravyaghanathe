class Solution {
    public int heightChecker(int[] heights) {
          
       int[] buckets = new int[101];
        for(int h:heights)
        {
            buckets[h]++;
        }
        int currHeight=0,mis=0;
        for(int arrayHeight :heights)
        {
            while(buckets[currHeight]==0)
            {
                currHeight++;
            }
            if(currHeight!=arrayHeight)
            {
                mis++;
            }
            buckets[currHeight]--;
        }
        return mis;

    }
}