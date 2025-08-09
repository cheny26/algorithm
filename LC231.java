/**
 * @author chen_y
 * @date 2025-08-09 10:13
 */
public class LC231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        LC231 lc231 = new LC231();
        lc231.isPowerOfTwo(-2147483648);
    }
}
