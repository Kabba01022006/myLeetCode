1class Solution {
2    public int countGoodRotations(int[] nums) {
3        int n=nums.length;
4        //first calculate the total sum 
5        long tSum=0;
6        for(int i=0;i<n;i++){
7            tSum+=nums[i];
8        }
9        //calculate the leftSum
10        long lSum=0;
11        for(int i=0;i<n/2;i++){
12            lSum+=nums[i];
13        }
14        int leftEndIdx = (n/2) - 1;
15        int rightEndIdx = n - 1;
16        int count=0;
17        for(int i=0;i<n;i++){
18            long rSum = tSum - lSum;
19            if(lSum>rSum) count++;
20            int leavingLeft = nums[leftEndIdx];
21            int enteringLeft = nums[rightEndIdx];
22            lSum = lSum - leavingLeft + enteringLeft;
23        
24            //fake rotating our array 
25            //the next element will be the previous one i.e. current - 1 
26            leftEndIdx = (leftEndIdx - 1 + n)%n;
27            rightEndIdx = (rightEndIdx - 1 + n)%n;
28        }
29        return count;
30    }
31}
32