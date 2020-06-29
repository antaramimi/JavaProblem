import interview.Anagrams;
import org.junit.Assert;
import org.junit.Test;


public class AnagramsTest {

    @Test
    public void isAnagram() {
        boolean result = Anagrams.isAnagrams("peek", "keep");
        Assert.assertEquals(result, true);
    }

    @Test
    public void isAnagramTrue() {
        boolean result = Anagrams.isAnagrams("mary", "army");
        Assert.assertEquals(result, true);
    }

    @Test
    public void isAnagramFalse() {
        boolean result = Anagrams.isAnagrams("dart", "mart");
        Assert.assertEquals(result, false);
    }

    @Test
    public void isAnagramDifferentLength() {
        boolean result = Anagrams.isAnagrams("Hello Good Morning", "Madam");
        Assert.assertEquals(result, false);
    }

    @Test
    public void isAnagramCapital() {
        boolean result = Anagrams.isAnagrams("DOG", "god");
        Assert.assertEquals(result, false);
    }

    @Test
    public void isAnagramHaveSingle() {
        boolean result = Anagrams.isAnagrams("a", "a");
        Assert.assertEquals(result, true);
    }

    @Test
    public void isAnagramTrue2() {
        boolean result = Anagrams.isAnagrams("word", "wrdo");
        Assert.assertEquals(result, true);
    }

    @Test
    public void isAnagramFalse2() {
        boolean result = Anagrams.isAnagrams("c", "ccccccccccccccccc");
        Assert.assertEquals(result, false);
    }

    @Test
    public void isAnagramTrue3() {
        boolean result = Anagrams.isAnagrams("fill", "fil");
        Assert.assertEquals(result, false);
    }

    @Test
    public void isAnagramEmpty() {
        boolean result = Anagrams.isAnagrams("", "fil");
        Assert.assertEquals(result, false);
    }

}
