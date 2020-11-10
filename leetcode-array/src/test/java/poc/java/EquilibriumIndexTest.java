package poc.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.EquilibriumIndex;

@SpringBootTest
public class EquilibriumIndexTest {

	@Autowired
	private EquilibriumIndex service;

	@Test
	public void test1() {
		assertEquals(4, service.equilibriumIndex(new int[] { 2, 3, 4, 1, 4 }));
	}

	@Test
	public void test2() {
		assertEquals(2, service.equilibriumIndex(new int[] { -7, 1, 5, 2, -4, 3, 0 }));
	}
}
