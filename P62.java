package pro;

import java.util.*;

public class P62 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		searchString(s);
		in.close();
		System.out.println(searchString(s));
	}

	public static String searchString(String s) {
		String a = "";
		OUTER: for (int i = s.length(); i > 1; i--) {
			for (int j = 0; j <= s.length() - i; j++) {
				a = "";
				for (int k = j; k < j + i; k++) {
					a += s.charAt(k) + "";
				}
				if (palindrome(a)) {
					break OUTER;
				}
			}
		}
		return a;
	}

	public static boolean palindrome(String s) {
		StringBuffer sr = new StringBuffer(s);
		String s1 = sr.reverse().toString();
		if (s1.equals(s)) {
			return true;
		} else {
			return false;
		}

	}

}
