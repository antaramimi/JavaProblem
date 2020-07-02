/**
 * How do you print the first non-repeated character from a string?
 *
 */
package interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharacter {

    public static void main(String[] args) {
        System.out.println(nonRepeatedCharacter("JavaJ2EE"));
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
