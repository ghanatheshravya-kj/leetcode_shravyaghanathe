class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> uni =new HashSet<Character>();
        int left=0,max=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            while(uni.contains(ch))
            {
                uni.remove(s.charAt(left));
                left++;
            }
            uni.add(ch);
            max=Math.max(max,right-left+1);  //uni.size();
        }
        return  max;
    }
}