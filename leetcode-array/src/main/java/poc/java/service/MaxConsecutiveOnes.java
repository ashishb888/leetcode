package poc.java.service;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class MaxConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
		String s = Arrays.stream(nums).boxed().map(String::valueOf).collect(Collectors.joining());

		if (!s.contains("1") || (nums.length == 1 && s.contains("0")))
			return 0;

		if (!s.contains("0"))
			return s.length();

		return Stream.of(s.split("0")).mapToInt(String::length).max().getAsInt();
	}
}
