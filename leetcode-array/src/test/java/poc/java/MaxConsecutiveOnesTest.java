package poc.java;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import poc.java.service.MaxConsecutiveOnes;

@SpringBootTest
public class MaxConsecutiveOnesTest {

	@Autowired
	private MaxConsecutiveOnes mco;

	@Test
	public void test1() {
		assertEquals(2, mco.findMaxConsecutiveOnes(new int[] { 1, 0, 1, 1, 0, 1 }));
	}
}
