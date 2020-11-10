package poc.java.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class EquilibriumIndex {

	public int equilibriumIndex(int[] arr) {
		int len = arr.length;
		int sum = Arrays.stream(arr).skip(1L).sum();
		int leftSum = 0;

		for (int i = 0, j = 1; i < len; i++, j++) {
			sum -= arr[j];
			leftSum += arr[i];

			if (sum == leftSum)
				return arr[i + 1];
		}

		return -1;
	}
}
