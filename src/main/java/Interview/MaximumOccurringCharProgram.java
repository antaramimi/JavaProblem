package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaximumOccurringCharProgram {

    private static void printMaxOccuringChar(String inputString){
        HashMap<Character,Integer> charCountNumber = new HashMap<>();
        char[] CharArray = inputString.replaceAll("/s","").toCharArray();
        for(char c: CharArray){
            if(charCountNumber.containsKey(c)){
                charCountNumber.put(c, charCountNumber.get(c)+1);
            }else{
             charCountNumber.put(c,1);
            }
        }

        Set<Map.Entry<Character,Integer>> entrySet= charCountNumber.entrySet();
        int maxCount=0;
        char maxChar=0;

        for(Map.Entry<Character,Integer> entry:entrySet){
            if(entry.getValue()>maxCount){
                maxCount=entry.getValue();
                maxChar=entry.getKey();
            }
        }
        System.out.println(maxChar+" : "+maxCount);

    }

    public static void main(String[] args)
    {
        printMaxOccuringChar("Java Concept Of The Day");

        System.out.println("========================");

        printMaxOccuringChar("Java J2ee Android Hibernate JSP");

        System.out.println("========================");

        printMaxOccuringChar("abbcccddddeeeeeffffff");

        System.out.println("=========================");

        printMaxOccuringChar("122333444455555666666");
    }

}
