package poc.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.ReverseString;

@SpringBootTest
public class ReverseStringTest {

	@Autowired
	private ReverseString service;

	@Test
	public void test1() {
		assertArrayEquals(new char[] { 'o', 'l', 'l', 'e', 'h' },
				service.reverseString(new char[] { 'h', 'e', 'l', 'l', 'o' }));
	}

	@Test
	public void test2() {
		assertArrayEquals(new char[] { 'h', 'a', 'n', 'n', 'a', 'H' },
				service.reverseString(new char[] { 'H', 'a', 'n', 'n', 'a', 'h' }));
	}
}
