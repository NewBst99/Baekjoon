package testbaek;

import java.util.Scanner;

public class Baek10813 {
	public static void main(String[] args) {
		int chg = 0;
		
		Scanner in = new Scanner(System.in);
	
		int bas = in.nextInt();
		int cnt = in.nextInt();
		int[] N = new int[bas];
		
		for(int i = 0; i < bas; i++) {
			N[i] = i + 1;
		}
		for(int j = 0; j < cnt; j++) {
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			num1--;
			num2--;
			if(num1 == num2) {
				//nothing
			}
			else {
				chg = N[num1];
				N[num1] = N[num2];
				N[num2] = chg;
			}
		}
		for(int k = 0; k < bas; k++) {
			System.out.print(N[k]);
			if(k != bas)
				System.out.print(" ");
		}
	}
}