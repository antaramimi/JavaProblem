package miscellaneousproblems;

import java.util.*;

public class CommonCharacterProblem {
    public static void main(String[] args) {
        String a = "happy";
        String b = "mopey";
        System.out.println("Display common character " + commonCharacter(a, b));
        System.out.println("Display no" + notCommonCharacter(a, b));
        CommonCharacterAnotherSol(a, b);
        System.out.println(repeatedCharacters(a));
        repeatedCharacterUsingHashMap(a);

    }

    public static String commonCharacter(String a, String b) {
        List<Character> listOfCharacter = new ArrayList<>(); // result

        Set<Character> charactersInA = new HashSet<>();
        for (char c : a.toCharArray()) {
            charactersInA.add(c);
        }
        for (char c : b.toCharArray()) {
            if (charactersInA.contains(c)) {
                listOfCharacter.add(c);
            }
        }
        return listOfCharacter.toString();
    }


    public static String notCommonCharacter(String a, String b) {
        List<Character> listOfCharacter = new ArrayList<>();
        Set<Character> setOfCharacterA = new TreeSet<>();
        for (char c : a.toCharArray()) {
            setOfCharacterA.add(c);
        }
        for (char c : b.toCharArray()) {
            if (!setOfCharacterA.contains(c)) {
                listOfCharacter.add(c);
            }
        }
        return listOfCharacter.toString();
    }

    public static void CommonCharacterAnotherSol(String a, String b) {
        Set<Character> setOfCharacterA = new TreeSet<>();
        Set<Character> setOfCharacterB = new TreeSet<>();
        for (char c : a.toCharArray()) {
            setOfCharacterA.add(c);
        }
        for (char c : b.toCharArray()) {
            setOfCharacterB.add(c);
        }
        setOfCharacterA.retainAll(setOfCharacterB);
        System.out.println("Common characters in alphabetical order : " + setOfCharacterA);
    }

    public static String repeatedCharacters(String a) {
        Set<Character> listOfCharacter = new HashSet<>();
        char[] charStringofA = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (i != j && charStringofA[i] == charStringofA[j]) {
                    listOfCharacter.add(charStringofA[i]);
                }
            }
        }
        return listOfCharacter.toString();
    }

    public static void repeatedCharacterUsingHashMap(String a) {
        Map<Character, Integer> repeatedCharacter = new HashMap<>();
        //char[] charStringofA=a.toCharArray();
        for(char ch:a.toCharArray()){
            if(repeatedCharacter.containsKey(ch)){
                repeatedCharacter.put(ch,repeatedCharacter.get(ch)+1);
            }else {
                repeatedCharacter.put(ch,1);
            }
        }
        Set<Character> keys=repeatedCharacter.keySet();
        for(char c:keys) {
            if (repeatedCharacter.get(c) > 1) {
                System.out.println(repeatedCharacter.entrySet());

            }
        }

    }
}