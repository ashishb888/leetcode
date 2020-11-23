package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class ReverseInteger {

	public int reverse(int x) {

		if (x > 0 && x < 10)
			return x;

		boolean negative = x < 0 ? true : false;

		if (negative)
			x *= -1;

		int lastDigit = 0;
		long longResult = 0;

		while (x > 0) {
			lastDigit = x % 10;
			longResult = longResult * 10 + lastDigit;

			if (longResult > Integer.MAX_VALUE || longResult < Integer.MIN_VALUE)
				return 0;

			x /= 10;
		}

		return negative ? (int) longResult * -1 : (int) longResult;
	}
}
