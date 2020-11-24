package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.ValidAnagram;

@SpringBootTest
public class ValidAnagramTest {

	@Autowired
	private ValidAnagram service;

	@Test
	public void test1() {
		assertEquals(true, service.isAnagram("anagram", "nagaram"));
	}

	@Test
	public void test2() {
		assertEquals(false, service.isAnagram("rat", "car"));
	}

	@Test
	public void test3() {
		assertEquals(false, service.isAnagram("ac", "bb"));
	}

	@Test
	public void test4() {
		assertEquals(true, service.isAnagram("", ""));
	}
}
