package testbaek;

import java.util.HashSet;
import java.util.Scanner;

public class Baek3052 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++)
			hs.add(in.nextInt() % 42);
		
		System.out.print(hs.size());
	}
}