package poc.java.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class FindNumbersWithEvenNumberOfDigits {

	public int findNumbers(int[] nums) {
		return (int) Arrays.stream(nums).boxed().map(String::valueOf).filter(s -> s.length() % 2 == 0).count();
	}
}
