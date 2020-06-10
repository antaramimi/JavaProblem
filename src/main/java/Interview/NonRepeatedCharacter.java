/**
 * How do you print the first non-repeated character from a string?
 *
 */
package Interview;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class NonRepeatedCharacter {

    public static void main(String[] args) {
        System.out.println(nonRepeatedCharacter("abcdefghija"));
    }

    public static Character nonRepeatedCharacter(String characterString) {

        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < characterString.length(); i++) {
            Character c = characterString.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);

            }
        }

       // Set<String> repeatedSet = new HashSet<>();
        for (Map.Entry<Character, Integer> e : map.entrySet()) {

            Character wordMax = e.getKey();
            int count = e.getValue();

            if (count == 1) {
                return wordMax;
            }

        }
        return null;


    }
}
