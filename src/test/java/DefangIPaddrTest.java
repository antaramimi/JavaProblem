import interview.Anagrams;
import interview.DefangIPaddr;
import org.junit.Assert;
import org.junit.Test;

public class DefangIPaddrTest {
    @Test
    public void defangIPaddr() {
        String result = DefangIPaddr.defangIPaddr("1.1.1.1");
        Assert.assertEquals(result,"1[.]1[.]1[.]1");
    }

    @Test
    public void defangIPaddrTest1() {
        String result = DefangIPaddr.defangIPaddr("13.1000.17.15");
        Assert.assertEquals(result,"13[.]1000[.]17[.]15");
    }

    @Test
    public void defangIPaddrTest2() {
        String result = DefangIPaddr.defangIPaddr("255.100.50.0");
        Assert.assertEquals(result,"255[.]100[.]50[.]0");
    }

    @Test
    public void defangIPaddrTest3() {
        String result = DefangIPaddr.defangIPaddr("0.0..0");
        Assert.assertEquals(result,"0[.]0[.][.]0");
    }

}
