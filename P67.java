package guvi;

import java.util.Scanner;

public class P67 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("The Total Number Of Students :");
		in.nextInt();
		System.out.println("The Count Of Alex Friends :");
		int friends = in.nextInt();
		System.out.println("The Binary String of Students Sleeping details :");
		String sleep = in.next();
		int id[] = new int[friends];
		System.out.println("The ID numbers of Alex Friends :");
		for (int i = 0; i < friends; i++) {
			id[i] = in.nextInt();
		}
		in.close();
		System.out.println("Alex Homework Completion Details :");
		if (homework(sleep, id)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	public static boolean homework(String s, int b[]) {
		int a[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			a[i] = Character.getNumericValue(s.charAt(i));
		}
		int flag = 0;
		for (int i = 0; i < b.length; i++) {
			if (a[b[i] - 1] == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			return true;
		} else {
			return false;
		}

	}

}
