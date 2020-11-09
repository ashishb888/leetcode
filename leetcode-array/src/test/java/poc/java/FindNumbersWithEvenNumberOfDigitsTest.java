package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.FindNumbersWithEvenNumberOfDigits;

@SpringBootTest
public class FindNumbersWithEvenNumberOfDigitsTest {

	@Autowired
	private FindNumbersWithEvenNumberOfDigits service;

	@Test
	public void test1() {
		assertEquals(2, service.findNumbers((new int[] { 12, 345, 2, 6, 7896 })));
	}
}
