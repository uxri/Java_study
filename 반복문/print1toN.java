package third;

import java.util.Scanner;

public class print1toN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;

		for (i = 1; i <=n; i++) {
			System.out.println(i);
		}
	}
}
