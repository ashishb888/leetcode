package poc.java.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class SquaresOfSortedArray {

	public int[] sortedSquares(int[] A) {
		return Arrays.stream(A).map(e -> e * e).sorted().toArray();
	}
}
