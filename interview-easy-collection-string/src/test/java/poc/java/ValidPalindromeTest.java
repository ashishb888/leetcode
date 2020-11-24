package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.ValidPalindrome;

@SpringBootTest
public class ValidPalindromeTest {

	@Autowired
	private ValidPalindrome service;

	@Test
	public void test1() {
		assertEquals(true, service.isPalindrome("A man, a plan, a canal: Panama"));
	}

	@Test
	public void test2() {
		assertEquals(false, service.isPalindrome("race a car"));
	}
}
