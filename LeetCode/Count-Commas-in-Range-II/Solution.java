1class Solution {
2    public long countCommas(long n) {
3        long total = 0;
4        int digits = countDigits(n);
5        long power = 1;
6        for (int i = 1; i < digits; i++) {
7            power *= 10;
8        }
9        while (digits >= 4) {
10            int commas = (digits - 1) / 3;
11            long count = n - power + 1;
12            total += count * commas;
13            n = power - 1;
14            power /= 10;
15            digits--;
16        }
17        return total;
18    }
19
20    public int countDigits(long n) {
21        int digits = 0;
22        while (n != 0) {
23            digits++;
24            n /= 10;
25        }
26        return digits;
27    }
28}