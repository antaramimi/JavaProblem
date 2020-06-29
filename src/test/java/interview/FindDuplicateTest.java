package interview;

import interview.FindDuplicate;
import interview.MissingInArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FindDuplicateTest {

    @Test
    public void testWithDuplicates() {
        List<String> lb = new ArrayList<>();
        lb.add("ram");
        lb.add("antara");
        lb.add("ram");
        Set<String> actual = FindDuplicate.duplicateElement(lb);
        Set<String> expected = new HashSet<>();
        expected.add("ram");
        assertEquals(actual, expected);
    }

    @Test
    public void testWithMultipleDuplicates() {
        List<String> lb = new ArrayList<>();
        lb.add("1");
        lb.add("2");
        lb.add("3");
        lb.add("4");
        lb.add("1");
        lb.add("2");
        lb.add("3");
        lb.add("4");
        Set<String> actual = FindDuplicate.duplicateElement(lb);
        Set<String> expected = new HashSet<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        expected.add("4");
        assertEquals(actual, expected);
    }

    @Test
    public void testWithNoDuplicates() {
        List<String> lb = new ArrayList<>();
        lb.add("1");
        lb.add("4");
        lb.add("9");
        lb.add("15");
        lb.add("8");
        lb.add("7");
        lb.add("88");
        lb.add("3");
        Set<String> actual = FindDuplicate.duplicateElement(lb);
        Set<String> expected = new HashSet<>();
        expected.add("");
        assertEquals(actual, expected);
    }

    @Test
    public void testWithNull() {
        List<String> lb = new ArrayList<>();
        lb.add("");
        Set<String> actual = FindDuplicate.duplicateElement(lb);
        Set<String> expected = new HashSet<>();
        expected.add("");
        assertEquals(actual, expected);
    }

    @Test
    public void testWithSameString() {
        List<String> lb = new ArrayList<>();
        lb.add("ram");
        lb.add("ram");
        lb.add("ram");
        Set<String> actual = FindDuplicate.duplicateElement(lb);
        Set<String> expected = new HashSet<>();
        expected.add("ram");
        assertEquals(actual, expected);
    }


}
