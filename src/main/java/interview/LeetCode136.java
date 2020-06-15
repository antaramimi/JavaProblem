package interview;
/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 */

import java.util.HashMap;
import java.util.Map;


public class LeetCode136 {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer c : nums)
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        for (Integer k : map.keySet()) {
            if (map.get(k) == 1)
                return k;
        }
        return -1;

    }


}
