1class Solution {
2    public int minimumSum(int num) {
3        int[] arr = new int[4];
4        int i=0;
5        while(num!=0){
6            arr[i] = num%10;
7            num/=10;
8            i++;
9        }
10        // 2239
11        Arrays.sort(arr);
12        int sum=0;
13        int l=0;
14        int r=3;
15        while(l<r){
16            sum+=(arr[l]*10 + arr[r]);
17            l++;
18            r--;
19        }
20        return sum;
21    }
22}