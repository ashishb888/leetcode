package poc.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.MergeSortedArray;

@SpringBootTest
public class MergeSortedArrayTest {

	@Autowired
	private MergeSortedArray service;

	@Test
	public void test1() {
		assertArrayEquals(new int[] { 1, 2, 2, 3, 5, 6 },
				service.merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3));
	}
}
