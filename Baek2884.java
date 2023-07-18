package testbaek;

import java.util.Scanner;

public class Baek2884 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int H = input.nextInt();
		int M = input.nextInt();
		int min = M - 45;
		if((0 <= H) && (H <= 23) && (0 <= M) && (M <= 59)) {
			if(min < 0) {
				if(H == 0)
					H = 23;
				else
					H--;
				M = 60 + min;
			}
		}
		System.out.print(H + " " + M);
	}
}
