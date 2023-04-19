import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void reversedTest2(){
    int[] test1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(test1));
  }

  @Test
  public void reversedInPlace2(){
    int[] test2 = {4,5,6};
    ArrayExamples.reverseInPlace(test2);
    assertArrayEquals(new int[] {6,5,4}, test2);
  }
}
