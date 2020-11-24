package poc.java.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

@Service
public class StringToInteger {

	public int myAtoi(String s) {
		if (s == null || s.isEmpty())
			return 0;

		String trimed = s.trim();

		if (trimed.isEmpty())
			return 0;

		String firstC = String.valueOf(trimed.charAt(0));

		if (!firstC.matches("^[-+0-9]"))
			return 0;

		if (firstC.matches("^[-+]") && trimed.length() == 1)
			return 0;

		if (trimed.length() == 1)
			return Integer.parseInt(trimed);

		String secondC = String.valueOf(trimed.charAt(1));

		if (!secondC.matches("^[0-9.]"))
			return 0;

		Pattern pattern = Pattern.compile("^[-+]?[0-9]*\\.?[0-9]+$");
		Matcher matcher = pattern.matcher(trimed);

		if (matcher.find()) {
			try {
				String n = matcher.group();

				if (n.contains("."))
					n = n.split("\\.")[0];

				return Integer.parseInt(n);
			} catch (NumberFormatException e) {
				return Integer.MIN_VALUE;
			}
		} else {
			try {
				return Integer.parseInt(trimed.replaceAll("[^0-9-]", ""));
			} catch (NumberFormatException e) {
				return Integer.MIN_VALUE;
			}
		}
	}
}
