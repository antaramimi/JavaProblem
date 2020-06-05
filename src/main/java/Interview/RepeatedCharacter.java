package Interview;

import Collection.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatedCharacter {

    public static Set<String> repeatedString(String paragraph) {
        Set<String> setString = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        String[] words = paragraph.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            String word = m.getKey();
            Integer count = m.getValue();
            if (count > 1) {
                setString.add(word);
            }
        }
        return setString;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("i have two number and two word ram is ram"));
        System.out.println(repeatedString("i have  number and two word is"));
        System.out.println(repeatedString(""));
    }

}
