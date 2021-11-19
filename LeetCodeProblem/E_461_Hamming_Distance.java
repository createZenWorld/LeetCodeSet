/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 * Given two integers x and y, return the Hamming distance between them.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 1, y = 4
 * Output: 2
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * The above arrows point to positions where the corresponding bits are different.
 * Example 2:
 *
 * Input: x = 3, y = 1
 * Output: 1
 *
 *
 * Constraints:
 *
 * 0 <= x, y <= 231 - 1
 *
 * 思路解析：
 * 首先要清楚韩明距离的意思，它表示两个（相同长度）字对应位不同的数量
 * 那么就可以利用异或的特点，不同的位异或位1，相同的位异或位1，那么就可以
 * 通过异或出来的数，求其中1的个数获取汉明距离
 */
public class E_461_Hamming_Distance {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;
        while (z != 0) {
            if ((z & 1) == 1) {
                count++;
            }
            z = z >> 1;
        }
        return count;
    }
}
