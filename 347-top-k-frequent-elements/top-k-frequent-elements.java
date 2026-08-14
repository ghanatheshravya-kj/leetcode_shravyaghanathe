class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> freq=new HashMap<Integer,Integer>();
        for(int key:nums)
        {
            freq.put(key,freq.getOrDefault(key,0)+1);
        }
        List<Integer> [] buckets=new ArrayList[nums.length+1];
        for(int key:freq.keySet())
        {
            int valueIndex=freq.get(key);
            if( buckets[valueIndex]==null)
            {
                buckets[valueIndex]=new ArrayList<Integer>();
            }
            buckets[valueIndex].add(key);
        }
        int res[]=new int[k];
        int index=0;
        for(int i=buckets.length-1;i>=0;i--)
        {
            if(buckets[i]!=null && k!=0)
            {
                for(int ele:buckets[i])
                {
                    res[index]=ele;
                    index++;;
                    k--;
                    if(k==0)
                    {
                        break;
                    }
                }
            }
        }
        return res;
    }
}