package poc.java.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class MergeSortedArray {
	public int[] merge(int[] nums1, int m, int[] nums2, int n) {

		for (int i = m, j = 0; i < nums1.length; i++, j++) {
			nums1[i] = nums2[j];
		}

		Arrays.sort(nums1);

		return nums1;
	}
}
