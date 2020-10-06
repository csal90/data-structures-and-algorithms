package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    // This solution returns the index of the numbers
    //Time complexity : O(n)
    // Space complexity : O(n)

    public static int[] twoSumSol(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if (map.containsKey(delta)) {
                return new int[] {map.get(delta), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
