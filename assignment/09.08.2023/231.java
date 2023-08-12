class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        // Using bitwise operation to check if there's only one '1' bit
        return (n & (n - 1)) == 0;
    }
}