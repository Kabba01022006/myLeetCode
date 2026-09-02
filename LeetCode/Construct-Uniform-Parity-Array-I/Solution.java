1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        // Key idea:
4    // If all elements have the same parity, we can simply keep them as they are.
5    // If the array contains both odd and even numbers:
6    // odd - odd = even
7    // even - even = even
8    // So we can make odd elements even by subtracting another odd element,
9    // while keeping the even elements unchanged.
10    // Since the elements are distinct, a suitable other index always exists.
11    // Therefore, it is always possible to construct nums2 with all elements having the same parity.
12    return true;
13    }
14}