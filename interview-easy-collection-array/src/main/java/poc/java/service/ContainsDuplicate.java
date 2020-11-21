package poc.java.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length <= 1)
			return false;

		return Arrays.stream(nums).distinct().count() != nums.length;
	}
}
