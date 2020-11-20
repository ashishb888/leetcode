package poc.java.domain;

public class MyLinkedList {
	Node head;

	public void append(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		current.next = new Node(data);
	}

	public void prepend(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}

		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}

	public void delete(int data) {
		if (head == null)
			return;

		if (head.data == data) {
			head = head.next;
			return;
		}

		Node current = head;

		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}

			current = current.next;
		}
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}
	
}
