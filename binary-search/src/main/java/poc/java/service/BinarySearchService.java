package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class BinarySearchService {

	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return -1;

		int l = 0;
		int r = nums.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;
			// int mid = (l + r) >>> 1;
			int midVal = nums[mid];

			if (midVal < target)
				l = mid + 1;
			else if (midVal > target)
				r = mid - 1;
			else
				return mid;
		}

		return -1;
		// return -(l + 1);
	}
}
