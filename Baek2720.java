package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int Q, D, N, P;
		
		for(int i = 0; i < num; i++) {
			int price = Integer.parseInt(br.readLine());
			Q = price / 25;
			price %= 25;
			D = price / 10;
			price %= 10;
			N = price / 5;
			P = price % 5;
			System.out.println(Q + " " + D + " " + N + " " + P);
		}
		
	}
}
