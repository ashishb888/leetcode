package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.ImplementIndexOf;

@SpringBootTest
public class ImplementIndexOfTest {

	@Autowired
	private ImplementIndexOf service;

	@Test
	public void test1() {
		assertEquals(0, service.strStr("", ""));
	}

	@Test
	public void test2() {
		assertEquals(2, service.strStr("hello", "ll"));
	}

	@Test
	public void test3() {
		assertEquals(-1, service.strStr("aaaaa", "bba"));
	}

	@Test
	public void test4() {
		assertEquals(-1, service.strStr("", "a"));
	}

	@Test
	public void test5() {
		assertEquals(0, service.strStr("a", ""));
	}

	@Test
	public void test6() {
		assertEquals(4, service.strStr("mississippi", "issip"));
	}
}
