package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class DuplicateZeros {

	public int[] duplicateZeros(int[] arr) {
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			if (arr[i] == 0) {
				for (int j = len - 1; j > i; j--) {
					arr[j] = arr[j - 1];
				}
				i++;
			}
		}

		return arr;
	}
}
