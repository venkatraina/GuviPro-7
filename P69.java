package venkat;

import java.util.*;

public class P69 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Input :");
		String input = in.next();
		System.out.println("Output of The Program is :");
		System.out.println(findingNumerics(input));
		in.close();

	}

	public static int findingNumerics(String input) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				al.add(Character.getNumericValue(input.charAt(i)));
			}
		}
		Collections.sort(al);
		int sum1 = 0;
		int sum2 = 1;
		int max = al.get(al.size() - 1);
		int min = al.get(0);
		for (int a : al) {
			sum1 += max * a;
			sum2 *= min * a;
		}

		sum1 = singleDigitSum(sum1);
		sum2 = singleDigitSum(sum2);
		int output = Math.min(sum1, sum2);
		return (int) Math.pow(output, 2);

	}

	public static int singleDigitSum(int n) {
		int sum = 0;
		while (n > 0) {
			while (n != 0) {
				sum += n % 10;
				n /= 10;
			}
			if (sum >= 10) {
				n = sum;
				sum = 0;
			}
		}
		return sum;
	}

}
