1class Solution {
2    public int minBishopMoves(int[] source, int[] target) {
3        int sourceSum = source[0]+source[1];
4        int targetSum = target[0]+target[1];
5        if(sourceSum%2==0 && targetSum%2!=0) return -1;
6        else if(sourceSum%2!=0 && targetSum%2==0) return -1;
7        else{
8            if(sourceSum==targetSum) return 1;
9            if(source[0]-source[1]==target[0]-target[1]) return 1;
10            else return 2;
11        }
12    }
13}