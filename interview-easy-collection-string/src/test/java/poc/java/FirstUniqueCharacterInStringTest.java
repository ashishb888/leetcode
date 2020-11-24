package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.FirstUniqueCharacterInString;

@SpringBootTest
public class FirstUniqueCharacterInStringTest {

	@Autowired
	private FirstUniqueCharacterInString service;

	@Test
	public void test1() {
		assertEquals(0, service.firstUniqChar("leetcode"));
	}

	@Test
	public void test2() {
		assertEquals(2, service.firstUniqChar("loveleetcode"));
	}
}
