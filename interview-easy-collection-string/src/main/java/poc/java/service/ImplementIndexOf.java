package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class ImplementIndexOf {

	public int strStr(String haystack, String needle) {
		if ((haystack.isEmpty() && needle.isEmpty()) || needle.isEmpty())
			return 0;

		int arr1Len = haystack.length();
		int arr2Len = needle.length();

		if (arr1Len < arr2Len)
			return -1;

		char[] arr1 = haystack.toCharArray();
		char[] arr2 = needle.toCharArray();

		for (int i = 0; i < arr1Len; i++) {
			if (arr1Len - i < arr2Len)
				return -1;

			lb1: if (arr1[i] == arr2[0]) {
				for (int j = 1; j < arr2Len; j++) {
					if (arr1[i + j] != arr2[j]) {
						break lb1;
					}
				}
				return i;
			}
		}
		return -1;
	}
}
