package venkat;

import java.util.Scanner;

public class P61 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The String 1 :");
		String s1 = in.next();
		System.out.println("Enter The String 2 :");
		String s2 = in.next();
		System.out.println("The Encrypted Strings are :");
		System.out.print(encryption(s1, 1) + " ");
		System.out.print(encryption(s2, 2));
	}

	public static String encryption(String s, int n) {
		String s1 = "";
		if (n == 2) {
			s1 = s.substring(1, s.length() - 1).toLowerCase();
		}
		if (n == 1) {
			s1 = s.toLowerCase();
		}
		String result = "";
		for (int i = 0; i < s1.length(); i++) {
			int asci = (int) s1.charAt(i);
			asci += 10;
			if (asci > 122) {
				int t = asci - 122;
				asci = 96 + t;
				result += (char) asci + "";
			} else {
				result += (char) asci;
			}
		}
		if (n == 2) {
			result = s.charAt(0) + result + s.charAt(s.length() - 1);

		}
		result = togglingCase(s, result);
		return result;
	}

	public static String togglingCase(String s1, String s2) {
		String output = "";
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isUpperCase(s1.charAt(i))) {
				output += Character.toUpperCase(s2.charAt(i));
			} else {
				output += s2.charAt(i);
			}
		}

		return output;
	}

}
