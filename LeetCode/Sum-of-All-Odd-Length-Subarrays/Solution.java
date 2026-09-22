1class Solution {
2    public int sumOddLengthSubarrays(int[] arr) {
3        int totalSum=0;
4        for(int i=0;i<arr.length;i++){
5            int sum=0;
6            for(int j=i;j<arr.length;j++){
7                sum+=arr[j];
8
9                if((j - i + 1) % 2 != 0) {
10                totalSum += sum;
11                }
12            }
13        }
14        return totalSum;
15    }
16}
17