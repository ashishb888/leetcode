package poc.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.SquaresOfSortedArray;

@SpringBootTest
public class SquaresOfSortedArrayTest {

	@Autowired
	private SquaresOfSortedArray service;

	@Test
	public void test1() {
		assertArrayEquals(new int[] { 0, 1, 9, 16, 100 }, service.sortedSquares(new int[] { -4, -1, 0, 3, 10 }));
	}
}
