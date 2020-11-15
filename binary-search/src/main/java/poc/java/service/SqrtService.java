package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class SqrtService {

	public int mySqrt(int x) {
		if (x == 0 || x == 1)
			return x;

		int l = 1;
		int r = x;
		int sqrt = 0;

		while (l <= r) {
			// int mid = (l + r) / 2;
			// int mid = (l + r) >>> 1;
			int mid = l + (r - l) / 2;

			if (mid <= x / mid) {
				sqrt = mid;
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}

		return sqrt;
	}
}
