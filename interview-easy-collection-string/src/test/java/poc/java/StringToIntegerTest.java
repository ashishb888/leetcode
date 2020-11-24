package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.StringToInteger;

@SpringBootTest
public class StringToIntegerTest {

	@Autowired
	private StringToInteger service;

	@Test
	public void test1() {
		assertEquals(42, service.myAtoi("42"));
	}

	@Test
	public void test2() {
		assertEquals(-42, service.myAtoi("   -42"));
	}

	@Test
	public void test3() {
		assertEquals(4193, service.myAtoi("4193 with words"));
	}

	@Test
	public void test4() {
		assertEquals(-2147483648, service.myAtoi("-91283472332"));
	}

	@Test
	public void test5() {
		assertEquals(0, service.myAtoi("words and 987"));
	}

	
	@Test
	public void test6() {
		assertEquals(3, service.myAtoi("3.14159"));
	}
	
	@Test
	public void test7() {
		assertEquals(0, service.myAtoi("+-12"));
	}
	
	@Test
	public void test8() {
		assertEquals(1, service.myAtoi("1"));
	}

	@Test
	public void test9() {
		assertEquals(0, service.myAtoi("+"));
	}

}
