class Solution {
    public long countCommas(long n) {
        // if(n <= 999) return 0;

        long totalcomma = 0;

        for(long start = 1000; start <= n; start *= 1000){
            totalcomma += n - start + 1;
        }

        return totalcomma;
    }
}