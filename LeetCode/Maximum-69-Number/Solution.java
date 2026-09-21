1class Solution {
2    public int maximum69Number (int num) {
3        int[] arr = new int[count(num)];
4        for(int i=arr.length-1;i>=0;i--){
5            arr[i]=num%10;
6            num/=10;
7        }
8        for(int i=0;i<arr.length;i++){
9            if(arr[i]==6){
10                arr[i]=9;
11                break;
12            }
13        }
14        // 9 6 6 9
15       int sum = 0;
16       int place = 1;
17
18        for(int i=arr.length-1;i>=0;i--){
19        sum += arr[i] * place;
20        place *= 10;
21        }
22        return sum;
23    }
24    public int count (int n) {
25        int count=0;
26        while(n!=0){
27            n/=10;
28            count++;
29        }
30        return count;
31    }
32}