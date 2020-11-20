package poc.java.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import poc.java.domain.MyLinkedList;

@Slf4j
@Service
public class MyLinkedListService {

	private MyLinkedList list = new MyLinkedList();

	public void append(int data) {
		list.append(data);
		log.debug("append: " + list);
	}

	public void prepend(int data) {
		list.prepend(data);
		log.debug("prepend: " + list);
	}

	public void delete(int data) {
		list.delete(data);
		log.debug("delete: " + list);
	}
}
