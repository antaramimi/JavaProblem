package interview;

import interview.MissingInArray;
import org.junit.Assert;
import org.junit.Test;

public class MissingInArrayTest {
    @Test
    public void IsNumberMissingInArray() {
        int[] input = new int[] {1, 2, 4, 5};
        int result = MissingInArray.missingArray(input);
        Assert.assertEquals(result,3);
    }

    @Test
    public void IsArrayStartWithZero() {
        int[] input = new int[] {0, 1, 3, 4, 5};
        int result = MissingInArray.missingArray(input);
        Assert.assertEquals(result,2);
    }

    @Test
    public void IsEmptyArray() {
        int[] input = new int[] {};
        int result = MissingInArray.missingArray(input);
        Assert.assertNull(result);
    }
    @Test
    public void IsArrayContainDecimal() {
        int[] input = new int[]{(int) 1.1, 3, 4, 5};
        int result = MissingInArray.missingArray(input);
        Assert.assertEquals(result,2);
    }


}
