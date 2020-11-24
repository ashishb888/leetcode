package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		if (s == null || t == null)
			return false;

		if (s.isEmpty() && t.isEmpty())
			return true;

		if (s.length() != t.length())
			return false;

		String[] arr = s.split("");
		StringBuilder sb = new StringBuilder(t);

		for (int i = 0; i < arr.length; i++) {
			int index = sb.indexOf(arr[i]);
			if (index == -1)
				return false;

			sb.deleteCharAt(index);
		}

		return true;

		// StringBuilder sb1 = s.chars().sorted().collect(StringBuilder::new,
		// StringBuilder::appendCodePoint,
		// StringBuilder::append);
		// StringBuilder sb2 = t.chars().sorted().collect(StringBuilder::new,
		// StringBuilder::appendCodePoint,
		// StringBuilder::append);
		//
		// return sb1.equals(sb2);
		// return s.chars().sum() == t.chars().sum();
	}
}
