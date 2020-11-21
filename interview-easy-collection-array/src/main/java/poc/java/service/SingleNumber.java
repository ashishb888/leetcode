package poc.java.service;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class SingleNumber {
	public int singleNumber(int[] nums) {
		return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).mapToInt(Map.Entry::getKey).findFirst().getAsInt();
	}
}
