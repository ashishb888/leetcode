package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.BinarySearchService;

@SpringBootTest
public class BinarySearchServiceTest {

	@Autowired
	private BinarySearchService service;

	@Test
	public void test1() {
		assertEquals(4, service.search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
	}

	@Test
	public void test2() {
		assertEquals(-1, service.search(new int[] { -1, 0, 3, 5, 9, 12 }, 13));
	}
}
