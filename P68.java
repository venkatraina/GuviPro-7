package venkat;

import java.util.Scanner;

public class P68 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String in1 = in.next();
		String in2 = in.next();
		String pin = in.next();
		int n = in.nextInt();
		System.out.println(passwordGeneration(in1, in2, pin, n));

	}

	public static String passwordGeneration(String fn, String ln, String pin, int key) {
		String s1 = fn.toLowerCase();
		String s2 = ln.toLowerCase();
		String longn = "";
		String sn = "";
		if (s1.compareTo(s2) > 0) {
			longn = fn;
			sn = ln;
		} else {
			longn = ln;
			sn = fn;
		}
		String pass = "";
		pass += pin.charAt(key - 1);
		pass += pin.charAt(pin.length() - key);

		String result = longn.charAt(0) + sn + pass;
		return result;

	}

}
