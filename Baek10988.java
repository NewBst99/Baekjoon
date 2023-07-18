package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10988 {
	public static void main(String[] args) throws IOException {
		//BufferReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int len = str.length();
		char[] ary = str.toCharArray();
		int a = len / 2;
		int b = len % 2;
		int sel = 0;
		
		for(int i = 0; i < a; i++) {
			if(ary[i] != ary[len - i - 1])
				sel++;
		}
		if(sel == 0)
			System.out.println("1");
		else 
			System.out.println("0");
	}
}
