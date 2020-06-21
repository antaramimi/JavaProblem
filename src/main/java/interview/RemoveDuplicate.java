package interview;

import java.util.*;

/**
 *Removing Duplicate Characters in a String
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(removeDuplicateCharacter("geeksforgeeks"));
    }
    public static String removeDuplicateCharacter(String listContainDuplicate){
        Set<Character> charactersInA = new LinkedHashSet<>();
        for (char yourlist: listContainDuplicate.toCharArray()){
            charactersInA.add(yourlist);

            }
        return charactersInA.toString();

    }
}
