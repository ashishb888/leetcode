package poc.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

		assertEquals(2, service.removeDuplicates(inArr).length);
		assertArrayEquals(expectedArr, service.removeDuplicates(inArr));
	}
}
