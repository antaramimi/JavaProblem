package codingbatpractice.string;

/**
 * Questions:
 * Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
 * separated by the separator string.
 * Examples:
 * repeatSeparator("Word", "X", 3) → "WordXWordXWord"
 * repeatSeparator("This", "And", 2) → "ThisAndThis"
 * repeatSeparator("This", "And", 1) → "This"
 */
public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {

            String newString="";

            for (int i =0; i <count; i++){
                if(i==count-1){
                    newString=newString+word;
                }else{
                    newString=newString+word+sep;
                }
            }
            return newString;
        }

    }
