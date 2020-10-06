package leetcode.easy;

import java.util.HashSet;

public class singleNumber {

    // Simple solution (XOR): O(n) time and O(1) space
    public int singleNumberSol(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a ^= i;
        }
        return a;
    }

    // HashSet solution
    public static int singleNumberSol2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        for (int i : set) {
            return i;
        }
        return -1;
    }

}
