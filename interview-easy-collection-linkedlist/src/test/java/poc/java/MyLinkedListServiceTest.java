package poc.java;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import poc.java.service.MyLinkedListService;

@SpringBootTest
public class MyLinkedListServiceTest {

	@Autowired
	private MyLinkedListService service;

	@Test
	public void test1() {
		service.append(10);
		service.append(20);
		service.append(30);
		service.append(40);
		service.append(50);
		service.append(60);
		service.prepend(70);
		service.delete(40);
	}

}
