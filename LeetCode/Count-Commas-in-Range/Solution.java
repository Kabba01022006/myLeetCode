1class Solution {
2    public int countCommas(int n) {
3    return (n <= 999) ? 0 : n - 999;
4    }
5}