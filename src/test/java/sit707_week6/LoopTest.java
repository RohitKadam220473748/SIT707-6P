package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class LoopTest {
	@Test
    public void testSumofNumbersupto7() {
        Loop newloop = new Loop();
        int result = newloop.SumoftheNumbers(7);
        Assert.assertEquals(28, result); 
    }
 
 @Test
    public void testSumofNumbersupto10() {
        Loop newloop = new Loop();
        int result = newloop.SumoftheNumbers(10);
        Assert.assertEquals(55, result); 
    }
 
 @Test
 public void testSumOfNumbersZero() {
     Loop lp = new Loop();
     int result = lp.SumoftheNumbers(0);
     Assert.assertEquals(0, result); 
 }
 
 @Test
 public void testSumOfNumbersNegative() {
     Loop loop = new Loop();
     int result = loop.SumoftheNumbers(-5);
     Assert.assertEquals(0, result); 
 }
 
 @Test
 public void testSumOfNumbersUpto30() {
     Loop loop = new Loop();
     int result = loop.SumoftheNumbers(30);
     Assert.assertEquals(465, result); 
 }
 
 
 @Test
    public void testSumOfEvenAndOddNumberswithoddnumberd5() {
        Loop nwloop = new Loop();
        int result1 = nwloop.sumOfEvenAndOddNumbers(5);
        Assert.assertEquals(15, result1); 
 }
 
 @Test
    public void testSumOfEvenAndOddNumberswithevennumber6() {
        Loop nwloop = new Loop();
        int result1 = nwloop.sumOfEvenAndOddNumbers(6);
        Assert.assertEquals(21, result1); 
 }
 
 @Test
    public void testSumOfEvenAndOddNumberswithevennumber13() {
        Loop nwloop = new Loop();
        int result1 = nwloop.sumOfEvenAndOddNumbers(13);
        Assert.assertEquals(91, result1); 
 }
 
 
 @Test
 public void testSumOfEvenAndOddNumbersZero() {
     Loop loop = new Loop();
     int result = loop.sumOfEvenAndOddNumbers(0);
     Assert.assertEquals(0, result); 
 }
 
 @Test
 public void testSumOfEvenAndOddNumbersNegative() {
     Loop loop = new Loop();
     int result = loop.sumOfEvenAndOddNumbers(-5);
     Assert.assertEquals(0, result); 
 }
}
