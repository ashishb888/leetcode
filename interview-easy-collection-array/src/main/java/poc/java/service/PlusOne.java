package poc.java.service;

import org.springframework.stereotype.Service;

@Service
public class PlusOne {
	public int[] plusOne(int[] digits) {
		int len = digits.length;

		if (digits[len - 1] != 9) {
			digits[len - 1] = digits[len - 1] + 1;
			return digits;
		}

		for (int i = len - 1; i > 0; i--) {
			digits[i] = digits[i] + 1;
		}

		return digits;

//		StringBuilder sb = Arrays.stream(digits).collect(StringBuilder::new, StringBuilder::append,
//				StringBuilder::append);
//		String s = sb.toString();
//		long n = Long.parseLong(s);
//
//		if (n == 0 && len > 1) {
//			int[] arr = new int[len];
//			arr[len - 1] = 1;
//			return arr;
//		}
//
//		return Arrays.stream(String.valueOf(n + 1).split("")).mapToInt(Integer::valueOf).toArray();

//		System.out.println(Arrays.toString(Arrays.stream(String.valueOf(Integer.parseInt(sb.toString()) + 1).split("")).mapToInt(Integer::valueOf).toArray()));
//		
//		System.out.println(Arrays.toString(String.valueOf(Integer.parseInt(sb.toString()) + 1).chars().toArray()));
//		return String.valueOf(Integer.parseInt(sb.toString()) + 1).codePoints().toArray();

//		return Arrays.stream(String.valueOf(Arrays.stream(digits).sum()).split("")).mapToInt(Integer::valueOf)
//				.toArray();
	}
}
