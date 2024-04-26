package sit707_week6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoopTest {
    private Loop loop;

    @Before
    public void setUp() {
        loop = new Loop();
    }

    @Test
    public void testSumofNumbersupto7() {
        int result = loop.SumoftheNumbers(7);
        Assert.assertEquals(28, result);
    }
    

    @Test
    public void testSumofNumbersupto10() {
        int result = loop.SumoftheNumbers(10);
        Assert.assertEquals(55, result);
    }

    @Test
    public void testSumOfNumbersZero() {
        int result = loop.SumoftheNumbers(0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSumOfNumbersNegative() {
        int result = loop.SumoftheNumbers(-5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSumOfNumbersUpto30() {
        int result = loop.SumoftheNumbers(30);
        Assert.assertEquals(465, result);
    }

    @Test
    public void testSumOfEvenAndOddNumberswithoddnumberd5() {
        int result1 = loop.sumOfEvenAndOddNumbers(5);
        Assert.assertEquals(15, result1);
    }

    @Test
    public void testSumOfEvenAndOddNumberswithevennumber6() {
        int result1 = loop.sumOfEvenAndOddNumbers(6);
        Assert.assertEquals(21, result1);
    }

    @Test
    public void testSumOfEvenAndOddNumberswithevennumber13() {
        int result1 = loop.sumOfEvenAndOddNumbers(13);
        Assert.assertEquals(91, result1);
    }

    @Test
    public void testSumOfEvenAndOddNumberswithZero() {
        int result = loop.sumOfEvenAndOddNumbers(0);
        Assert.assertEquals(0, result);
    }
}
