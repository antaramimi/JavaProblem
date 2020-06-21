package interview;

/**
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode217 {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (Integer c : nums) {
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }
        Set<Integer> setNumber = new HashSet<>();
        for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
            Integer number = m.getKey();
            Integer count = m.getValue();
            if (count > 1) {
                setNumber.add(number);
                return true;
            }
        }

        return false;
    }
}

