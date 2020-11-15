package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.SqrtService;

@SpringBootTest
public class SqrtServiceTest {

	@Autowired
	private SqrtService service;

	@Test
	public void test1() {
		assertEquals(2, service.mySqrt(8));
	}

	@Test
	public void test2() {
		assertEquals(3, service.mySqrt(9));
	}

	@Test
	public void test3() {
		assertEquals(2, service.mySqrt(4));
	}

	@Test
	public void test4() {
		assertEquals(46339, service.mySqrt(2147395599));
	}
}
