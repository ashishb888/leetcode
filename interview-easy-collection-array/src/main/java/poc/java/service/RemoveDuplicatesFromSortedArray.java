package poc.java.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class RemoveDuplicatesFromSortedArray {

	public int[] removeDuplicates(int[] nums) {
		int[] arr = Arrays.stream(nums).distinct().toArray();
		System.arraycopy(arr, 0, nums, 0, arr.length); // in-place modification

		return arr;
	}
}
