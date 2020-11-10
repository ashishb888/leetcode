package poc.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.DuplicateZeros;

@SpringBootTest
public class DuplicateZerosTest {

	@Autowired
	private DuplicateZeros service;

	@Test
	public void test1() {
		assertArrayEquals(new int[] { 1, 0, 0, 2, 3, 0, 0, 4 },
				service.duplicateZeros(new int[] { 1, 0, 2, 3, 0, 4, 5, 0 }));
	}
}
