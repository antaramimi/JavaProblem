package interview;

import interview.DefangIPaddr;
import interview.FindEverNumbers;
import org.junit.Assert;
import org.junit.Test;

public class FindEvenNumbersTest {
    @Test
    public void testArrayWithEvenNumber() {
        int result = FindEverNumbers.findNumbers(new int[]{437,315,322,431,686,264,442});
        Assert.assertEquals(result,0);
    }

    @Test
    public void testArrayWithMixedNumber() {
        int result = FindEverNumbers.findNumbers(new int[]{4374,3157,32,31,686,26004,4742});
        Assert.assertEquals(result,5);
    }

    @Test
    public void testArrayWithZero() {
        int result = FindEverNumbers.findNumbers(new int[]{0,0,0,0,0,0});
        Assert.assertEquals(result,0);
    }

    @Test
    public void testArrayWithNull() {
        int result = FindEverNumbers.findNumbers(new int[]{});
        Assert.assertEquals(result,0);
    }
}
