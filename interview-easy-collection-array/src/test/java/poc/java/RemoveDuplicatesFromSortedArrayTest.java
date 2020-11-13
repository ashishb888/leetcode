package poc.java;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.RemoveDuplicatesFromSortedArray;

@SpringBootTest
public class RemoveDuplicatesFromSortedArrayTest {

	@Autowired
	private RemoveDuplicatesFromSortedArray service;

	@Test
	public void test1() {
		int[] inArr = new int[] { 1, 1, 2 };
		int[] expectedArr = new int[] { 1, 2 };
		int[] actualArr = service.removeDuplicates(inArr);

		assertTrue(2 == actualArr.length && Arrays.equals(expectedArr, actualArr));

		// assertEquals(2, service.removeDuplicates(inArr).length);
		// assertArrayEquals(expectedArr, service.removeDuplicates(inArr));
	}
}
