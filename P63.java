package pro;

import java.util.Scanner;

public class P63 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The String :");
		String s = in.next();
		searchString(s);
		in.close();
		System.out.println("Longest Substring Without Repetation :");
		System.out.println(searchString(s));

	}

	public static String searchString(String s) {
		String a = "";
		OUTER: for (int i = s.length(); i >= 1; i--) {
			for (int j = 0; j <= s.length() - i; j++) {
				a = "";
				for (int k = j; k < j + i; k++) {
					a += s.charAt(k) + "";
				}
				if (repetation(a)) {
					break OUTER;
				} else {
					continue;
				}
			}
		}
		return a;
	}

	public static boolean repetation(String s) {
		boolean result = true;
		OUTER: for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					result = false;
					break OUTER;
				}
			}
		}

		return result;
	}

}
