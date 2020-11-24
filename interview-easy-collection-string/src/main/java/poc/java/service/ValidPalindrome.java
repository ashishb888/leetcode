package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		if (s == null)
			return false;

		if (s.isEmpty())
			return true;

		char[] arr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			if (arr[start] != arr[end])
				return false;
			start++;
			end--;
		}

		return true;
	}
}
