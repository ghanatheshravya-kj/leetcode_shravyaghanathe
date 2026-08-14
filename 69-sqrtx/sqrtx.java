/*class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        for (int i = 1; i <= x; i++) {
            if ((long) i * i > x) {
                return i - 1;
            }
        }

        return x;
    }
}*/
class Solution {
    public int mySqrt(int x)
    {


    if (x < 2) 
      return x;
        int left = 1, right = x / 2, ans = 0;
        while (left <= right
        ) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x)
             {
                ans = mid;        // mid is a valid candidate
                left = mid + 1;   // try to find a bigger one
            } else {
                right = mid - 1;  // mid^2 too big, move left
            }
        }
        return ans;
}
}