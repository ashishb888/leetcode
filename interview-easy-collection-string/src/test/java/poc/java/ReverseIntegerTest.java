package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.ReverseInteger;

@SpringBootTest
public class ReverseIntegerTest {

	@Autowired
	private ReverseInteger service;

	@Test
	public void test1() {
		assertEquals(321, service.reverse(123));
	}

	@Test
	public void test2() {
		assertEquals(21, service.reverse(120));
	}

	@Test
	public void test3() {
		assertEquals(0, service.reverse(0));
	}

	@Test
	public void test4() {
		assertEquals(-321, service.reverse(-123));
	}

	@Test
	public void test5() {
		assertEquals(0, service.reverse(1534236469));
	}
}
