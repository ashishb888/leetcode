package poc.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.PlusOne;

@SpringBootTest
public class PlusOneTest {

	@Autowired
	private PlusOne service;

	@Test
	public void test1() {
		assertArrayEquals(new int[] { 1, 2, 4 }, service.plusOne(new int[] { 1, 2, 3 }));
	}

	@Test
	public void test2() {
		assertArrayEquals(new int[] { 4, 3, 2, 2 }, service.plusOne(new int[] { 4, 3, 2, 1 }));
	}

	@Test
	public void test3() {
		assertArrayEquals(new int[] { 1 }, service.plusOne(new int[] { 0 }));
	}

	@Test
	public void test5() {
		assertArrayEquals(new int[] { 0, 1 }, service.plusOne(new int[] { 0, 0 }));
	}
}
