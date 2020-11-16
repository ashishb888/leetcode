package poc.java;

import org.springframework.stereotype.Service;

@Service
public class ReverseStringService {

	private void reverseString(char[] s, int start, int end) {
		if (s == null || s.length == 0)
			return;

		if (start >= end)
			return;

		swap(s, start, end);
		reverseString(s, ++start, --end);
	}

	private void swap(char[] s, int first, int second) {
		char tmp = s[first];
		s[first] = s[second];
		s[second] = tmp;
	}

	public char[] reverseString(char[] s) {
		reverseString(s, 0, s.length - 1);

		return s;
	}

}
