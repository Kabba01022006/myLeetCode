1class Solution {
2    public long countCommas(long n) {
3        long countCom=0;
4        int len = countDigit(n);
5        while(len>=4){
6            //5,200,000 to 1,000,000 ,
7            // thats 5,200,000 - 999,999 + 1 commas
8            int commas = (len-1)/3;
9            long nums = n - exp(10,len-1) + 1;
10            countCom += nums*commas;
11            n = exp(10,len-1)-1;
12            len--;
13        }
14        
15        return countCom;
16    }
17
18    public int countDigit(long n){
19        int count=0;
20        while(n!=0){
21            count++;
22            n=n/10;
23        }
24        return count;
25    }
26
27    public long exp(int base, int pow){
28        long ans = 1 ;
29        for(int i=0;i<pow;i++){
30            ans = ans * base ; 
31        }
32        return ans;
33    }
34}