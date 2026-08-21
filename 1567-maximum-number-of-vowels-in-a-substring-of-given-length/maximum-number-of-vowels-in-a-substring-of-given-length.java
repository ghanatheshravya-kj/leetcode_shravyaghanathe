class Solution {
    public int maxVowels(String s, int k) {
       String vowel="aeiou";
       int count =0;
       for(int i=0;i<=k-1;i++)
       {
          if(vowel.contains(String.valueOf(s.charAt(i))))
          {
            count ++;
          }
       } 
       int maxVowels=count;
       for(int i=k;i<s.length();i++)
       {
            if(vowel.contains(String.valueOf(s.charAt(i))))
            count ++;
            if(vowel.contains(String.valueOf(s.charAt(i-k))))
            count --;
            maxVowels=Math.max(count,maxVowels);
       }
       return maxVowels;
    }
}