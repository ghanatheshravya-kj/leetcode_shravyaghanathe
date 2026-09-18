class Solution {
    public String reverseVowels(String s) {
        int left=0, right=s.length()-1;
        char[] chars=s.toCharArray();
        while(left<right)
        {
            while(left<right && !isVowel(chars[left]))
            {
                left++;
            }
            while(left<right && !isVowel(chars[right]))
            {
                right--;
            }
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);
    }
    public boolean isVowel(char ch)
    {
        return "aeiouAEIOU".contains(""+ch);
    }
}