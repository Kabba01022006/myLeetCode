class Solution {
    public long countCommas(long n) {

        long total = 0;
        int digits = countDigits(n);

        long power = 1;
        for (int i = 1; i < digits; i++) {
            power *= 10;
        }

        while (digits >= 4) {

            int commas = (digits - 1) / 3;
            long count = n - power + 1;

            total += count * commas;

            n = power - 1;
            power /= 10;
            digits--;
        }
        return total;
    }

    public int countDigits(long n) {
        int digits = 0;
        while (n != 0) {
            digits++;
            n /= 10;
        }
        return digits;
    }
}