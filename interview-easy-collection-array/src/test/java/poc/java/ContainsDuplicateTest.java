package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.ContainsDuplicate;

@SpringBootTest
public class ContainsDuplicateTest {

	@Autowired
	private ContainsDuplicate service;

	@Test
	public void test1() {
		assertEquals(true, service.containsDuplicate(new int[] { 1, 2, 3, 1 }));
	}

	@Test
	public void test2() {
		assertEquals(false, service.containsDuplicate(new int[] { 1, 2, 3, 4 }));
	}

	@Test
	public void test3() {
		assertEquals(true, service.containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
	}
}
