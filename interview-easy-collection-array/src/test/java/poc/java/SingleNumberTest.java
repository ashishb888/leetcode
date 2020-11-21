package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.SingleNumber;

@SpringBootTest
public class SingleNumberTest {

	@Autowired
	private SingleNumber service;

	@Test
	public void test1() {
		assertEquals(1, service.singleNumber(new int[] { 2, 2, 1 }));
	}

	@Test
	public void test2() {
		assertEquals(4, service.singleNumber(new int[] { 4, 1, 2, 1, 2 }));
	}

	@Test
	public void test3() {
		assertEquals(1, service.singleNumber(new int[] { 1 }));
	}
}
