1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] ans = new int[n][n];
4        int num = 1;
5        int top = 0 ;
6        int bottom = n - 1;
7        int left = 0 ;
8        int right = n - 1;
9        while(top<=bottom && left<=right){
10
11            for(int i=left;i<=right;i++){
12                ans[top][i]=num;
13                num++;
14            }
15            top++;
16
17            for(int i=top;i<=bottom;i++){
18                ans[i][right]=num;
19                num++;
20            }
21            right--;
22
23            if(top<=bottom){
24                for(int i=right;i>=left;i--){
25                ans[bottom][i]=num;
26                num++;
27                }
28                bottom--;
29            }
30
31            if(left<=right){
32                for(int i=bottom;i>=top;i--){
33                ans[i][left]=num;
34                num++;
35                }
36            left++;
37            }
38        }
39        return ans;
40    }
41}