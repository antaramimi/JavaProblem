package interview;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        System.out.println("vowels:"+count("i hate you").getVowels());
        System.out.println("consonants:"+count("i hate you").getConsonants());
    }

    public static Result count(String str) {
        Result result = new Result();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'u') {
                result.setVowels(result.getVowels() + 1);
            } else if(str.charAt(i)> 'a' && str.charAt(i)<'z') {
                result.setConsonants(result.getConsonants() + 1);
            }
        }
        return result;
    }
}
    class Result {
        int vowelsCount;
        int consonantsCount;


        public int getVowels() {
            return vowelsCount;
        }

        public void setVowels(int vowelsCount) {
            this.vowelsCount = vowelsCount;
        }

        public int getConsonants() {
            return consonantsCount;
        }

        public void setConsonants(int consonantsCount) {
            this.consonantsCount = consonantsCount;

        }
    }



